package com.gab.recipesappforworkmate.data.filework.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "recipe_steps",
    foreignKeys = [
        ForeignKey(
            entity = RecipeEntity::class,
            parentColumns = ["id"],
            childColumns = ["recipeId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class RecipeStepEntity(
    @PrimaryKey(autoGenerate = true)
    val stepId: Long = 0,
    val recipeId: Long,
    val number: Int,
    val description: String,
)