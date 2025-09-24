package com.gab.recipesappforworkmate.data.network.dto

import com.google.gson.annotations.SerializedName

data class IngredientInfoDto(
    @SerializedName("id") val id: Long,
    @SerializedName("image") val image: String,
    @SerializedName("name") val name: String,
    @SerializedName("original") val fullDescription: String,
    @SerializedName("measures") val measures: IngredientMetcirMeasure
)