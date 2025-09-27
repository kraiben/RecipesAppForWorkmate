package com.gab.recipesappforworkmate.data.filework.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dish_types")
data class DishTypeEntity(
    @PrimaryKey
    val name: String,
)