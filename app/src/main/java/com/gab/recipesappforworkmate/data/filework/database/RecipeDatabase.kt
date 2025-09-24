package com.gab.recipesappforworkmate.data.filework.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gab.recipesappforworkmate.data.filework.entities.DishTypeEntity
import com.gab.recipesappforworkmate.data.filework.entities.IngredientEntity
import com.gab.recipesappforworkmate.data.filework.entities.RecipeDishTypeCrossRef
import com.gab.recipesappforworkmate.data.filework.entities.RecipeEntity
import com.gab.recipesappforworkmate.data.filework.entities.RecipeStepEntity

@Database(
    entities = [
        RecipeEntity::class,
        DishTypeEntity::class,
        RecipeDishTypeCrossRef::class,
        IngredientEntity::class,
        RecipeStepEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(UriConverter::class)
abstract class RecipeDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}