package com.amary.poke.droid.domain.repository

import com.amary.poke.droid.domain.model.ResultModel

interface PokeRepository {
    suspend fun listPokemon(): List<ResultModel>

    suspend fun listLocalPokemon(): List<ResultModel>

    suspend fun savePokemon(pokemon: List<ResultModel>)

    suspend fun deletePokemon()

}