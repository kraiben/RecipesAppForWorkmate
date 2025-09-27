package com.gab.recipesappforworkmate.data.network

import com.gab.recipesappforworkmate.data.network.dto.RandomRecipesResultDto
import com.gab.recipesappforworkmate.data.network.dto.SearchRecipesResultDto
import com.gab.recipesappforworkmate.domain.entities.DishType
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
import kotlinx.coroutines.withContext
import java.net.SocketTimeoutException
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
    private val apiService: RecipesApiService,
    private val mapper: NetworkMapper,
) : NetworkRepository {
    private val cs = CoroutineScope(Dispatchers.IO)
    private val _totalResults = MutableSharedFlow<Int>()
    private val totalResults: StateFlow<Int> = flow {
        _totalResults.collect {
            emit(it)
        }
    }.stateIn(cs, SharingStarted.Lazily, 0)
    private val searchRecipesResponseFLow = MutableSharedFlow<SearchRecipesResultDto?>()
    private val searchRecipesFLow: StateFlow<List<RecipeInfoModel>?> = flow {
        searchRecipesResponseFLow.collect {
            val newRecipesList = it?.recipes?.map { r -> with(mapper) { r.toInfoModel() } }
            _totalResults.emit(it?.totalResults ?: 0)
            emit(newRecipesList)
        }
    }.stateIn(cs, SharingStarted.Lazily, emptyList())

    override suspend fun searchRecipes(query: String, dishTypeFilter: DishType, chunk: Int): Unit =
        runCatching {
            withContext(Dispatchers.IO) {

                lastQuery = query
                val response = apiService.searchRecipes(
                    query,
                    number = CHUNK_SIZE,
                    offset = chunk * CHUNK_SIZE,
                    type = dishTypeFilter.typeName
                )
                searchRecipesResponseFLow.emit(response)

            }
        }.getOrNull() ?: withContext(Dispatchers.IO) {
            searchRecipesResponseFLow.emit(null)
        }


@Volatile
private var lastQuery: String = ""

override fun getSearchedRecipesFlow(): StateFlow<List<RecipeInfoModel>?> {
    cs.launch {
        searchRecipes(lastQuery, DishType.NONE, 0)
    }
    return searchRecipesFLow
}

private val randomRecipesResponseFLow = MutableSharedFlow<RandomRecipesResultDto?>()
private val randomRecipesFLow: StateFlow<List<RecipeInfoModel>?> = flow {
    randomRecipesResponseFLow.collect {
        val newRecipesList = it?.recipes?.map { r -> with(mapper) { r.toInfoModel() } }
        emit(newRecipesList)
    }
}.stateIn(cs, SharingStarted.Lazily, emptyList())

override suspend fun updateRandomRecipesFlow(size: Int) {
    cs.launch {
        val response = try {
            apiService.getRandomRecipes(size)
        } catch (
            e: SocketTimeoutException,
        ) {
            null
        }
        GAB_CHECK("updateRandomRecipesFlow $response")
        randomRecipesResponseFLow.emit(
            response
        )
    }
}

override fun getRandomRecipesFlow(size: Int): StateFlow<List<RecipeInfoModel>?> {
    cs.launch {
        updateRandomRecipesFlow(size)
    }
    return randomRecipesFLow
}

override fun getTotalSearchResultAmount(): StateFlow<Int> = totalResults
}