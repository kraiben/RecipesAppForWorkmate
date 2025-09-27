package com.gab.recipesappforworkmate.data.network.dto

import com.google.gson.annotations.SerializedName

data class RecipeInfoDto(
    @SerializedName("id") val id: Long,
    @SerializedName("title") val title: String,
    @SerializedName("readyInMinutes") val cookingTime: Int,
    @SerializedName("imageType") val imageType: String,
    @SerializedName("extendedIngredients") val ingredients: List<IngredientInfoDto>,
    @SerializedName("summary") val summaryDescription: String,
    @SerializedName("dishTypes") val dishTypes: List<String>,
    @SerializedName("analyzedInstructions") val instructions: List<InstructionsDto>,
)
