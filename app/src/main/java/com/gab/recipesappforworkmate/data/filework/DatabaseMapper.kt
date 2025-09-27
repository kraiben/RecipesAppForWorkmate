package com.gab.recipesappforworkmate.data.filework

import androidx.core.net.toUri
import com.gab.recipesappforworkmate.data.filework.entities.DishTypeEntity
import com.gab.recipesappforworkmate.data.filework.entities.IngredientEntity
import com.gab.recipesappforworkmate.data.filework.entities.RecipeEntity
import com.gab.recipesappforworkmate.data.filework.entities.RecipeStepEntity
import com.gab.recipesappforworkmate.data.filework.entities.RecipeWithDetails
import com.gab.recipesappforworkmate.domain.models.DishType
import com.gab.recipesappforworkmate.domain.models.IngredientInfoModel
import com.gab.recipesappforworkmate.domain.models.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.models.RecipeStepInfoModel
import javax.inject.Inject

class DatabaseMapper @Inject constructor() {
    fun RecipeInfoModel.toEntity(): RecipeEntity = RecipeEntity(
        id = id,
        title = title,
        cookingTimeInMinutes = cookingTimeInMinutes,
        recipeImageUri = recipeImageUri.toString(),
        summaryDescription = summaryDescription
    )

    fun DishType.toEntity(): DishTypeEntity = DishTypeEntity(name = this.typeName)

    fun IngredientInfoModel.toEntity(recipeId: Long): IngredientEntity {
        return IngredientEntity(
            ingredientId = ingredientId,
            recipeId = recipeId,
            name = name,
            amount = amount,
            unit = unit,
            description = description,
            ingredientIconUri = ingredientIconUri.toString()
        )
    }

    fun RecipeStepInfoModel.toEntity(recipeId: Long): RecipeStepEntity = RecipeStepEntity(
        recipeId = recipeId,
        number = number,
        description = description
    )

    fun RecipeWithDetails.toInfoModel(): RecipeInfoModel {
        return RecipeInfoModel(
            id = recipe.id,
            title = recipe.title,
            cookingTimeInMinutes = recipe.cookingTimeInMinutes,
            dishTypes = dishTypes.map { DishType.fromName(it.name) },
            ingredients = ingredients.map { it.toInfoModel() },
            recipeImageUri = getImageUrl(recipe.id).toUri(),
            summaryDescription = recipe.summaryDescription,
            instructions = instructions.map { it.toInfoModel() }
        )
    }

    fun RecipeStepEntity.toInfoModel(): RecipeStepInfoModel = RecipeStepInfoModel(
        number = number,
        description = description
    )

    fun IngredientEntity.toInfoModel(): IngredientInfoModel = IngredientInfoModel(
        ingredientId = ingredientId,
        name = name,
        amount = amount,
        unit = unit,
        description = description,
        ingredientIconUri = ingredientIconUri.toUri()
    )

    fun getImageUrl(recipeId: Long): String {
        return "https://img.spoonacular.com/recipes/$recipeId-$RECIPE_IMAGE_QUALITY.jpg"
    }

    companion object {
        private const val RECIPE_IMAGE_QUALITY = "556x370"
    }
}