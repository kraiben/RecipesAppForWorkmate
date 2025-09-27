package com.gab.recipesappforworkmate.domain.usecases

import com.gab.recipesappforworkmate.domain.entities.DishType
import com.gab.recipesappforworkmate.domain.repositories.NetworkRepository
import javax.inject.Inject

class SearchRecipesUseCase @Inject constructor(
    private val repository: NetworkRepository,
) {
    suspend operator fun invoke(query: String, dishTypeFilter: DishType, chunk: Int) =
        repository.searchRecipes(query, dishTypeFilter, chunk)
}