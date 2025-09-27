package com.gab.recipesappforworkmate.domain.usecases

import com.gab.recipesappforworkmate.domain.models.DishType
import com.gab.recipesappforworkmate.domain.models.RecipeSearchQueryModel
import com.gab.recipesappforworkmate.domain.repositories.NetworkRepository
import javax.inject.Inject

class SearchRecipesUseCase @Inject constructor(
    private val repository: NetworkRepository,
) {
    suspend operator fun invoke(query: String, dishTypeFilter: DishType, chunk: Int) =
        repository.searchRecipes(RecipeSearchQueryModel(query, dishTypeFilter, chunk))
}