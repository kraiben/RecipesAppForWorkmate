package com.gab.recipesappforworkmate.data.filework.entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class RecipeWithDetails(
    @Embedded val recipe: RecipeEntity,
    @Relation(
        parentColumn = "id",           // ID рецепта в таблице recipes
        entityColumn = "name",         // Первичный ключ в таблице dish_types
        associateBy = Junction(
            value = RecipeDishTypeCrossRef::class,
            parentColumn = "recipeId",     // Столбец в crossref таблице, ссылающийся на рецепт
            entityColumn = "dishTypeName"  // Столбец в crossref таблице, ссылающийся на тип блюда
        )
    )
    val dishTypes: List<DishTypeEntity>,
    @Relation(
        parentColumn = "id",
        entityColumn = "recipeId"
    )
    val ingredients: List<IngredientEntity>,
    @Relation(
        parentColumn = "id",
        entityColumn = "recipeId"
    )
    val instructions: List<RecipeStepEntity>
)