package com.gab.recipesappforworkmate.domain.repositories

import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import kotlinx.coroutines.flow.StateFlow

interface NetworkRepository {

    suspend fun updateRandomRecipesFlow()
    suspend fun searchRecipes(query: String, number: Int, offset: Int)

    fun getSearchedRecipesFlow(): StateFlow<List<RecipeInfoModel>>
    fun getRandomRecipesFlow(): StateFlow<List<RecipeInfoModel>>
}
