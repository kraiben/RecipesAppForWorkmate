package com.gab.recipesappforworkmate.data.filework.entities

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "ingredients",
    foreignKeys = [
        ForeignKey(
            entity = RecipeEntity::class,
            parentColumns = ["id"],
            childColumns = ["recipeId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    primaryKeys = [
        "ingredientId",
        "description"
    ]
)
data class IngredientEntity(
    val ingredientId: Long = 0,
    val recipeId: Long,
    val name: String,
    val amount: Float,
    val unit: String,
    val description: String,
    val ingredientIconUri: String,
)