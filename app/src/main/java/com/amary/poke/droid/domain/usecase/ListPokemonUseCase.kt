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
                limit = 10,
                offset = offset
            )

            if (offset == 10) { repository.deletePokemon() }
            repository.savePokemon(remote.result)

            val model = repository.listLocalPokemon().distinctBy { it.name }
            emit(Result.success(PokeModel(result = model, next = remote.next)))

        } catch (e: Exception) {
            val model = repository.listLocalPokemon().distinctBy { it.name }
            if (model.isNotEmpty()) {
                emit(Result.success(PokeModel(result = model, next = offset)))
            } else {
                emit(Result.failure(Exception(e.localizedMessage)))
            }
        }
    }
}