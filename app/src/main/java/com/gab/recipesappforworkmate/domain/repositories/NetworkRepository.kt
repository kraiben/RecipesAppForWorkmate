package com.gab.recipesappforworkmate.domain.repositories

import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import kotlinx.coroutines.flow.StateFlow

interface NetworkRepository {

    fun getRandomRecipes(): StateFlow<List<RecipeInfoModel>>

    fun searchRecipes(query: String, number: Int, offset: Int): StateFlow<List<RecipeInfoModel>>

}
