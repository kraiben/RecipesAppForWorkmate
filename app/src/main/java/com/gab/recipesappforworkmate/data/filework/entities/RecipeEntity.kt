package com.gab.recipesappforworkmate.data.filework.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class RecipeEntity(
    @PrimaryKey
    val id: Long,
    val title: String,
    val cookingTimeInMinutes: Int,
    val recipeImageUri: String,
    val summaryDescription: String
)