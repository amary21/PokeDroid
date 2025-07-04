package com.amary.poke.droid.domain.repository

import com.amary.poke.droid.domain.model.AuthModel
import com.amary.poke.droid.domain.model.DetailModel
import com.amary.poke.droid.domain.model.ResultModel
import com.amary.poke.droid.domain.model.UserModel

interface PokeRepository {
    suspend fun listPokemon(
        limit: Int,
        offset: Int
    ): List<ResultModel>

    suspend fun getPokemonDetail(name: String): DetailModel

    suspend fun listLocalPokemon(): List<ResultModel>

    suspend fun savePokemon(pokemon: List<ResultModel>)

    suspend fun deletePokemon()

    suspend fun isUsernameExists(username: String): Boolean

    suspend fun insertUser(user: UserModel)

    suspend fun getUserById(userId: Int): UserModel?

    suspend fun login(username: String, password: String): UserModel?

    suspend fun insertAuth(auth: AuthModel)

    suspend fun logout()

    suspend fun isAuthenticated(): Boolean

    suspend fun getAuth(): AuthModel?
}