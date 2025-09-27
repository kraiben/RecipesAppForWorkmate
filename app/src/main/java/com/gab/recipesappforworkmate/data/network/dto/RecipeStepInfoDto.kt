package com.gab.recipesappforworkmate.data.network.dto

import com.google.gson.annotations.SerializedName

data class RecipeStepInfoDto(
    @SerializedName("number") val number: Int,
    @SerializedName("step") val description: String,
)