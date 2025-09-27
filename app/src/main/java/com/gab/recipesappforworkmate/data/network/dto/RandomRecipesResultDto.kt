package com.gab.recipesappforworkmate.data.network.dto

import com.google.gson.annotations.SerializedName

data class RandomRecipesResultDto(
    @SerializedName("recipes") val recipes: List<RecipeInfoDto>,
)
