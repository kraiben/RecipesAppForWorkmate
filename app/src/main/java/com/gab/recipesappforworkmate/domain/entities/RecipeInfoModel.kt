package com.gab.recipesappforworkmate.domain.entities

import android.net.Uri

data class RecipeInfoModel(
    val id: Long,
    val title: String,
    val cookingTimeInMinutes: Int,
    val shortDescription: String,
    val dishTypes: List<DishType>,
    val ingredients: List<IngredientInfoModel>,
    val recipeImageUri: Uri,
    val summaryDescription: String,
    val instructions: List<RecipeStepInfoModel>
)