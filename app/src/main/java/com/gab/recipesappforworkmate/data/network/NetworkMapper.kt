package com.gab.recipesappforworkmate.data.network

import android.net.Uri
import androidx.core.net.toUri
import com.gab.recipesappforworkmate.data.network.dto.IngredientInfoDto
import com.gab.recipesappforworkmate.data.network.dto.RecipeInfoDto
import com.gab.recipesappforworkmate.data.network.dto.RecipeStepInfoDto
import com.gab.recipesappforworkmate.domain.entities.DishType
import com.gab.recipesappforworkmate.domain.entities.IngredientInfoModel
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.entities.RecipeStepInfoModel
import javax.inject.Inject


class NetworkMapper @Inject constructor(){
    fun RecipeInfoDto.toInfoModel(): RecipeInfoModel = RecipeInfoModel(
        id = id,
        title = title,
        cookingTimeInMinutes = cookingTime,
        dishTypes = dishTypes.map {
            DishType.fromName(it)
        },
        ingredients = ingredients.map { it.toInfoModel() },
        recipeImageUri = imageLink.toUri(),
        summaryDescription = summaryDescription,
        instructions = instructions[0].steps.map {
            it.toInfoModel()
        }
    )

    fun IngredientInfoDto.toInfoModel(): IngredientInfoModel = IngredientInfoModel(
        ingredientId = id,
        name = name,
        amount = measures.measures.amount,
        unit = measures.measures.unit ?: "",
        description = fullDescription,
        ingredientIconUri = getIngredientImageUri(image),
    )

    private fun getIngredientImageUri(image: String): Uri =
        "$INGREDIENT_IMAGE_URI_PREFIX$image".toUri()

    fun RecipeStepInfoDto.toInfoModel(): RecipeStepInfoModel = RecipeStepInfoModel(
        number = number,
        description = description
    )

    private companion object {
        private const val INGREDIENT_IMAGE_SIZE = "100x100"
        private const val INGREDIENT_IMAGE_URI_PREFIX =
            "https://img.spoonacular.com/ingredients_$INGREDIENT_IMAGE_SIZE/"
    }
}