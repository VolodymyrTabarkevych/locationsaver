package ua.tabarkevych.locationsaver.core.domain

import kotlinx.coroutines.flow.Flow

interface SuspendUseCase<in P, out R> {

    @Suppress("UNCHECKED_CAST")
    suspend operator fun invoke(parameters: P = Unit as P): R
}

interface FlowUseCase<in P, out R> {

    @Suppress("UNCHECKED_CAST")
    operator fun invoke(parameters: P = Unit as P): Flow<R>
}