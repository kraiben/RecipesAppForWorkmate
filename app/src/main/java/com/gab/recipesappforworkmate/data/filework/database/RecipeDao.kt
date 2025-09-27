package com.gab.recipesappforworkmate.data.filework.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.gab.recipesappforworkmate.data.filework.entities.DishTypeEntity
import com.gab.recipesappforworkmate.data.filework.entities.IngredientEntity
import com.gab.recipesappforworkmate.data.filework.entities.RecipeDishTypeCrossRef
import com.gab.recipesappforworkmate.data.filework.entities.RecipeEntity
import com.gab.recipesappforworkmate.data.filework.entities.RecipeStepEntity
import com.gab.recipesappforworkmate.data.filework.entities.RecipeWithDetails

@Dao
interface RecipeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecipe(recipe: RecipeEntity): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertDishType(dishType: DishTypeEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertRecipeDishTypes(crossRefs: List<RecipeDishTypeCrossRef>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIngredients(ingredients: List<IngredientEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecipeSteps(steps: List<RecipeStepEntity>)

    @Transaction
    @Query("SELECT * FROM recipes WHERE id = :recipeId")
    suspend fun getRecipeWithDetails(recipeId: Long): RecipeWithDetails?

    @Transaction
    @Query("SELECT * FROM recipes")
    suspend fun getAllRecipesWithDetails(): List<RecipeWithDetails>

    @Query("DELETE FROM recipes WHERE id = :recipeId")
    suspend fun deleteRecipe(recipeId: Long)


}