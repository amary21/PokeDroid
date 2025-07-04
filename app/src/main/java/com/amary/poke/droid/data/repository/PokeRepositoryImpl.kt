package com.amary.poke.droid.data.repository

import com.amary.poke.droid.data.local.dao.PokeDao
import com.amary.poke.droid.data.local.entity.AuthEntity
import com.amary.poke.droid.data.local.entity.ResultEntity
import com.amary.poke.droid.data.local.entity.UserEntity
import com.amary.poke.droid.data.remote.api.PokeApi
import com.amary.poke.droid.domain.model.AuthModel
import com.amary.poke.droid.domain.model.DetailModel
import com.amary.poke.droid.domain.model.PokeModel
import com.amary.poke.droid.domain.model.ResultModel
import com.amary.poke.droid.domain.model.UserModel
import com.amary.poke.droid.domain.repository.PokeRepository
import kotlin.Int

class PokeRepositoryImpl(
    private val pokeApi: PokeApi,
    private val pokeDao: PokeDao
): PokeRepository {
    override suspend fun listPokemon(
        limit: Int,
        offset: Int
    ): PokeModel {
        val response = pokeApi.getPokemon(limit, offset)
        val offset = response.next
            ?.substringAfter("?")
            ?.split("&")
            ?.firstOrNull { it.startsWith("offset=") }
            ?.substringAfter("=")
            ?.toIntOrNull() ?: 10
        return PokeModel(
            next = offset,
            result = response.result?.map {
                ResultModel(
                    name = it.name.orEmpty(),
                    url = it.url.orEmpty()
                )
            }.orEmpty()
        )
    }

    override suspend fun getPokemonDetail(name: String): DetailModel {
        val response = pokeApi.getPokemonDetail(name)
        return DetailModel(
            baseExperience = response.baseExperience ?: 0,
            height = response.height ?: 0,
            id = response.id ?: 0,
            isDefault = response.isDefault ?: false,
            locationAreaEncounters = response.locationAreaEncounters ?: "",
            name = response.name ?: "",
            order = response.order ?: 0,
            weight = response.weight ?: 0,
        )
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

    override suspend fun isUsernameExists(username: String): Boolean {
        return pokeDao.isUsernameExists(username)
    }

    override suspend fun insertUser(user: UserModel) {
        pokeDao.insertUser(
            user = UserEntity(
                userName = user.userName,
                fullName = user.fullName,
                email = user.email,
                password = user.password,
            )
        )
    }

    override suspend fun getUserById(userId: Int): UserModel? {
        val entity = pokeDao.getUserById(userId)
        return entity?.let {
            UserModel(
                id = it.id,
                userName = it.userName,
                fullName = it.fullName,
                email = it.email,
                password = it.password,
            )
        }
    }

    override suspend fun login(
        username: String,
        password: String
    ): UserModel? {
        val entity = pokeDao.login(username, password)
        return entity?.let {
            UserModel(
                id = it.id,
                userName = it.userName,
                fullName = it.fullName,
                email = it.email,
                password = it.password,
            )
        }
    }

    override suspend fun insertAuth(auth: AuthModel) {
        pokeDao.insertAuth(
            auth = AuthEntity(
                id = auth.id
            )
        )
    }

    override suspend fun logout() {
        pokeDao.logout()
    }

    override suspend fun isAuthenticated(): Boolean {
        return pokeDao.isAuthenticated()
    }

    override suspend fun getAuth(): AuthModel? {
        val entity = pokeDao.getAuth()
        return entity?.let {
            AuthModel(
                id = it.id
            )
        }
    }
}