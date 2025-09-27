package com.gab.recipesappforworkmate.domain.usecases

import com.gab.recipesappforworkmate.domain.repositories.NetworkRepository
import javax.inject.Inject

class GetRandomRecipesFlowUseCase @Inject constructor(
    private val repository: NetworkRepository
) {
    operator fun invoke(size: Int) = repository.getRandomRecipesFlow(size)
}