package com.gab.recipesappforworkmate.data.filework.entities

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "recipe_dish_types",
    primaryKeys = ["recipeId", "dishTypeName"],
    foreignKeys = [
        ForeignKey(
            entity = RecipeEntity::class,
            parentColumns = ["id"],
            childColumns = ["recipeId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = DishTypeEntity::class,
            parentColumns = ["name"],
            childColumns = ["dishTypeName"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class RecipeDishTypeCrossRef(
    val recipeId: Long,
    val dishTypeName: String
)