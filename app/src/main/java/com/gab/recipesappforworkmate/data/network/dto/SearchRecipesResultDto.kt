package com.gab.recipesappforworkmate.data.network.dto

import com.google.gson.annotations.SerializedName

data class SearchRecipesResultDto(
    @SerializedName("results") val recipes: List<RecipeInfoDto>,
    @SerializedName("totalResults") val totalResults: Int,
)
