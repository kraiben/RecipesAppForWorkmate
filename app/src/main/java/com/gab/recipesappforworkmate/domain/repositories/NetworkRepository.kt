package com.gab.recipesappforworkmate.domain.repositories

import com.gab.recipesappforworkmate.domain.models.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.models.RecipeSearchQueryModel
import kotlinx.coroutines.flow.StateFlow

interface NetworkRepository {

    suspend fun updateRandomRecipesFlow(size: Int)
    fun getRandomRecipesFlow(size: Int): StateFlow<List<RecipeInfoModel>?>
    fun getTotalSearchResultAmount(): StateFlow<Int>
    suspend fun searchRecipes(query: RecipeSearchQueryModel)

    fun getSearchedRecipesFlow(): StateFlow<List<RecipeInfoModel>?>
}
