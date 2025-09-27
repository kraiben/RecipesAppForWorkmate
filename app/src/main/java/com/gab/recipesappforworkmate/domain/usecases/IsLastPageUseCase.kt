package com.gab.recipesappforworkmate.domain.usecases

import com.gab.recipesappforworkmate.data.network.CHUNK_SIZE
import com.gab.recipesappforworkmate.domain.repositories.NetworkRepository
import javax.inject.Inject

class IsLastPageUseCase @Inject constructor(
    private val repository: NetworkRepository,
) {
    val totalResults = repository.getTotalSearchResultAmount()
    operator fun invoke(currentChunkIndex: Int): Boolean {
        val maxChunkIndex =
            totalResults.value / CHUNK_SIZE - if (totalResults.value % CHUNK_SIZE > 0) 0 else 1
        return maxChunkIndex <= currentChunkIndex
    }
}