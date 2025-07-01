package com.amary.poke.droid.domain.usecase

import com.amary.poke.droid.domain.model.ResultModel
import com.amary.poke.droid.domain.repository.PokeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ListPokemonUseCase(
    private val repository: PokeRepository
) {
    operator fun invoke(): Flow<Result<List<ResultModel>>> = flow {
        try {
            val remote  = repository.listPokemon()
            emit(Result.success(remote))
        } catch (e: Exception) {
            val local = repository.listLocalPokemon()
            if (local.isNotEmpty()) {
                emit(Result.success(local))
            } else {
                emit(Result.failure(Exception(e.localizedMessage)))
            }
        }
    }
}