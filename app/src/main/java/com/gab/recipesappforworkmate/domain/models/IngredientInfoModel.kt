package com.gab.recipesappforworkmate.domain.models

import android.net.Uri

data class IngredientInfoModel(
    val ingredientId: Long,
    val name: String,
    val amount: Float,
    val unit: String,
    val description: String,
    val ingredientIconUri: Uri,
)
