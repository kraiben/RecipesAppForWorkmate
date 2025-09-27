package com.gab.recipesappforworkmate.domain.models

data class RecipeSearchQueryModel(
    val query: String = "",
    val dishTypeFilter: DishType = DishType.NONE,
    val chunk: Int = 0,
)