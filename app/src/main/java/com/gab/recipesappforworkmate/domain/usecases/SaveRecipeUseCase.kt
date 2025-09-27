package com.gab.recipesappforworkmate.domain.usecases

import com.gab.recipesappforworkmate.domain.models.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.repositories.DatabaseRepository
import javax.inject.Inject

class SaveRecipeUseCase @Inject constructor(private val repository: DatabaseRepository) {
    suspend operator fun invoke(recipe: RecipeInfoModel) {
        return repository.saveRecipe(recipe)
    }
}