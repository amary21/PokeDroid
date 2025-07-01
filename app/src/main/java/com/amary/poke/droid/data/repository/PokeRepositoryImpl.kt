package com.amary.poke.droid.data.repository

import com.amary.poke.droid.data.local.dao.PokeDao
import com.amary.poke.droid.data.local.entity.ResultEntity
import com.amary.poke.droid.data.remote.api.PokeApi
import com.amary.poke.droid.domain.model.ResultModel
import com.amary.poke.droid.domain.repository.PokeRepository

class PokeRepositoryImpl(
    private val pokeApi: PokeApi,
    private val pokeDao: PokeDao
): PokeRepository {
    override suspend fun listPokemon(): List<ResultModel> {
        val response = pokeApi.getPokemon()
        return response.result?.map {
            ResultModel(
                name = it.name.orEmpty(),
                url = it.url.orEmpty()
            )
        }.orEmpty()
    }

    override suspend fun listLocalPokemon(): List<ResultModel> {
        val entity = pokeDao.getAll()
        return entity.map {
            ResultModel(
                name = it.name,
                url = it.url
            )
        }
    }

    override suspend fun savePokemon(pokemon: List<ResultModel>) {
        pokeDao.insert(results = pokemon.map {
            ResultEntity(
                name = it.name,
                url = it.url
            )
        })
    }

    override suspend fun deletePokemon() {
        pokeDao.deleteAll()
    }
}