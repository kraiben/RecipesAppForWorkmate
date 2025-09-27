package com.gab.recipesappforworkmate.domain.repositories

import com.gab.recipesappforworkmate.domain.entities.DishType
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import kotlinx.coroutines.flow.StateFlow

interface NetworkRepository {

    suspend fun updateRandomRecipesFlow(size: Int)
    fun getRandomRecipesFlow(size: Int): StateFlow<List<RecipeInfoModel>?>
    fun getTotalSearchResultAmount(): StateFlow<Int>
    suspend fun searchRecipes(query: String, dishTypeFilter: DishType, chunk: Int)

    fun getSearchedRecipesFlow(): StateFlow<List<RecipeInfoModel>?>
}
