package com.amary.poke.droid.domain.usecase

import com.amary.poke.droid.domain.model.DetailModel
import com.amary.poke.droid.domain.repository.PokeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DetailUseCase(
    private val repository: PokeRepository
) {
    operator fun invoke(name: String): Flow<Result<DetailModel>> = flow {
        try {
            val model = repository.getPokemonDetail(name)
            emit(Result.success(model))
        } catch (e: Exception) {
            emit(Result.failure(e))
        }
    }
}