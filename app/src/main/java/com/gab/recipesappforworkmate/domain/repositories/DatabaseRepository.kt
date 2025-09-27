package com.gab.recipesappforworkmate.domain.repositories

import com.gab.recipesappforworkmate.domain.models.RecipeInfoModel
import kotlinx.coroutines.flow.StateFlow

interface DatabaseRepository {

    suspend fun saveRecipe(recipe: RecipeInfoModel)

    suspend fun deleteSavedRecipe(recipe: RecipeInfoModel)

    fun getSavedRecipes(): StateFlow<List<RecipeInfoModel>?>

}