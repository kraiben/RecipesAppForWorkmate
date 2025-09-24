package com.gab.recipesappforworkmate.data.network

import com.gab.recipesappforworkmate.data.network.dto.SearchRecipesResultDto
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.repositories.NetworkRepository
import com.gab.recipesappforworkmate.util.GAB_CHECK
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
    private val apiService: RecipesApiService,
    private val mapper: NetworkMapper,
) : NetworkRepository {
    private val cs = CoroutineScope(Dispatchers.IO)

    private val _searchedRecipesFlow = MutableSharedFlow<SearchRecipesResultDto>()
    private val searchedRecipesFlow: StateFlow<List<RecipeInfoModel>> = flow {
        _searchedRecipesFlow.collect {
            GAB_CHECK(it)
            emit(it.recipes.map { r -> with(mapper) { r.toInfoModel() } })
        }
    }.stateIn(cs, SharingStarted.Lazily, emptyList())

    override suspend fun searchRecipes(
        query: String,
        number: Int,
        offset: Int,
    ) {
        cs.launch {
            _searchedRecipesFlow.emit(apiService.searchRecipes(query, number, offset))
        }
    }

    override fun getSearchedRecipesFlow(): StateFlow<List<RecipeInfoModel>> = searchedRecipesFlow

    private val _randomRecipesFlow = MutableSharedFlow<SearchRecipesResultDto>()
    private val randomRecipesFlow: StateFlow<List<RecipeInfoModel>> = flow {
        _randomRecipesFlow.collect {
            emit(it.recipes.map { r -> with(mapper) { r.toInfoModel() } })
        }
    }.stateIn(cs, SharingStarted.Lazily, emptyList())

    override suspend fun updateRandomRecipesFlow() {
        cs.launch {
            _randomRecipesFlow.emit(
                apiService.getRandomRecipes(2)
            )
        }
    }

    override fun getRandomRecipesFlow(): StateFlow<List<RecipeInfoModel>> = randomRecipesFlow
}