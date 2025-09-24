package com.gab.recipesappforworkmate.data.network.dto

import com.google.gson.annotations.SerializedName

data class IngredientMetcirMeasure(
    @SerializedName("metric") val measures: IngredientMeasure
)