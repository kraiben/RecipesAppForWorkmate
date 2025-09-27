package com.gab.recipesappforworkmate.domain.usecases

import com.gab.recipesappforworkmate.data.network.CHUNK_SIZE
import com.gab.recipesappforworkmate.domain.repositories.NetworkRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

class IsLastPageUseCase @Inject constructor(
    private val repository: NetworkRepository
) {

    private val coroutineScope = CoroutineScope(Dispatchers.IO)
    private val isLastPageUseCaseInvoked = MutableSharedFlow<Int>()
    private val isLastPageUseCaseFlow: StateFlow<Boolean> = flow {
        repository.getTotalSearchResultAmount().collect {
            val maxChunkIndex = it / CHUNK_SIZE - if (it % CHUNK_SIZE > 0) 0 else 1
            emit(maxChunkIndex < currentChunkIndex)
        }
    }.stateIn(coroutineScope, SharingStarted.Lazily, true)

    suspend operator fun invoke(currentChunkIndex: Int): StateFlow<Boolean> {

    }
}