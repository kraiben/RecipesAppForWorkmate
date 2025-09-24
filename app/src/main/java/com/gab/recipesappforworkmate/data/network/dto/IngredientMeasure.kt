package com.gab.recipesappforworkmate.data.network.dto

import com.google.gson.annotations.SerializedName


data class IngredientMeasure(
    @SerializedName("amount") val amount: Float,
    @SerializedName("unitShort") val unit: String
)
