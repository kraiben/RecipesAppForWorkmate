package com.gab.recipesappforworkmate.domain.entities

import android.net.Uri

data class IngredientInfoModel(
    val id: Long,
    val name: String,
    val amount: Float,
    val unit: String,
    val description: String,
    val ingredientIconUri: Uri
)
