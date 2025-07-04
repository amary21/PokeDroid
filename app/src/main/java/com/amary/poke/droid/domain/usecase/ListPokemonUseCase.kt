package com.amary.poke.droid.domain.usecase

import com.amary.poke.droid.domain.model.PokeModel
import com.amary.poke.droid.domain.repository.PokeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ListPokemonUseCase(
    private val repository: PokeRepository
) {
    operator fun invoke(offset: Int): Flow<Result<PokeModel>> = flow {
        try {
            val remote  = repository.listPokemon(
                limit = 20,
                offset = offset
            )
            emit(Result.success(remote))
        } catch (e: Exception) {
            val local = repository.listLocalPokemon()
            if (local.isNotEmpty()) {
                emit(Result.success(PokeModel(result = local, next = offset)))
            } else {
                emit(Result.failure(Exception(e.localizedMessage)))
            }
        }
    }
}