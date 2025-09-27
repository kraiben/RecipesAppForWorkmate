package com.gab.recipesappforworkmate.domain.usecases

import com.gab.recipesappforworkmate.domain.models.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.repositories.DatabaseRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetSavedRecipesUseCase @Inject constructor(private val repository: DatabaseRepository) {
    operator fun invoke(): StateFlow<List<RecipeInfoModel>?> {
        return repository.getSavedRecipes()
    }
}