package com.gab.recipesappforworkmate.data.network.dto

import com.google.gson.annotations.SerializedName

data class InstructionsDto(
    @SerializedName("steps") val steps: List<RecipeStepInfoDto>
)
