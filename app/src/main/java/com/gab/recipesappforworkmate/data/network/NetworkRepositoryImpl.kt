package com.gab.recipesappforworkmate.data.network

import com.gab.recipesappforworkmate.data.filework.DatabaseMapper
import com.gab.recipesappforworkmate.data.filework.database.RecipeDao
import com.gab.recipesappforworkmate.data.network.dto.RandomRecipesResultDto
import com.gab.recipesappforworkmate.domain.models.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.models.RecipeSearchQueryModel
import com.gab.recipesappforworkmate.domain.repositories.NetworkRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
    private val apiService: RecipesApiService,
    private val mapper: NetworkMapper,
    private val recipeDao: RecipeDao,
    private val databasMapper: DatabaseMapper,
) : NetworkRepository {
    private val cs = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private val _totalResults = MutableSharedFlow<Int>()

    private val lastQueryState = MutableStateFlow(RecipeSearchQueryModel())

    private val searchRecipesResponseFLow = MutableSharedFlow<List<RecipeInfoModel>?>()
    private val searchRecipesFLow: StateFlow<List<RecipeInfoModel>?> = searchRecipesResponseFLow
//        .map {
//            val newRecipesList = it?.recipes?.map { r -> with(mapper) { r.toInfoModel() } }
//            _totalResults.emit(it?.totalResults ?: 0)
//            newRecipesList
//        }
        .stateIn(cs, SharingStarted.Eagerly, emptyList())

    init {
        subscribeOnLastQueryState()
    }

    @OptIn(FlowPreview::class, ExperimentalCoroutinesApi::class)
    private fun subscribeOnLastQueryState() {
        lastQueryState
            .flatMapLatest { getRecipesFlow(it) }
            .onEach { handleResultSearch(it) }
            .flowOn(Dispatchers.IO)
            .launchIn(cs)
    }

    private suspend fun handleResultSearch(results: List<RecipeInfoModel>) {
//        val newRecipesList = resultDto.recipes.map { r -> with(mapper) { r.toInfoModel() } }
//        _totalResults.emit(resultDto.totalResults)
        searchRecipesResponseFLow.emit(results)
    }

    private fun getRecipesFlow(query: RecipeSearchQueryModel): Flow<List<RecipeInfoModel>> = flow {
        try {
            val result = apiService.searchRecipes(
                query = query.query,
                number = CHUNK_SIZE,
                offset = query.chunk * CHUNK_SIZE,
                type = query.dishTypeFilter.typeName
            )
            val newRecipesList = result.recipes.map { r -> with(mapper) { r.toInfoModel() } }
            _totalResults.emit(result.totalResults)
            emit(newRecipesList)
        } catch (_: Exception) {
            val cache = recipeDao.searchRecipesByTitle(query.query)
            val result = cache.map { with(databasMapper) { it.toInfoModel() } }
            _totalResults.emit(result.size)
            emit(result)
        }
    }.flowOn(Dispatchers.IO)

    private val totalResults: StateFlow<Int> = flow {
        _totalResults.collect {
            emit(it)
        }
    }.stateIn(cs, SharingStarted.Eagerly, 0)

    override suspend fun searchRecipes(query: RecipeSearchQueryModel) {
        lastQueryState.emit(query)
    }


    override fun getSearchedRecipesFlow(): StateFlow<List<RecipeInfoModel>?> = searchRecipesFLow

    private val randomRecipesResponseFLow = MutableSharedFlow<RandomRecipesResultDto?>()
    private val randomRecipesFLow: StateFlow<List<RecipeInfoModel>?> = randomRecipesResponseFLow
        .map {
            val newRecipesList = it?.recipes?.map { r -> with(mapper) { r.toInfoModel() } }
            newRecipesList
        }
        .stateIn(cs, SharingStarted.Lazily, emptyList())

    override suspend fun updateRandomRecipesFlow(size: Int): Unit = withContext(Dispatchers.IO) {
        val response = try {
            apiService.getRandomRecipes(size)
        } catch (
            _: Exception,
        ) {
            null
        }
        randomRecipesResponseFLow.emit(
            response
        )

    }

    override fun getRandomRecipesFlow(size: Int): StateFlow<List<RecipeInfoModel>?> {
        cs.launch {
            updateRandomRecipesFlow(size)
        }
        return randomRecipesFLow
    }

    override fun getTotalSearchResultAmount(): StateFlow<Int> = totalResults
}