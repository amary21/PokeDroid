package com.amary.poke.droid.data.remote.api

import com.amary.poke.droid.data.remote.response.DetailResponse
import com.amary.poke.droid.data.remote.response.PokeResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApi {
    @GET("pokemon")
    suspend fun getPokemon(): PokeResponse

    @GET("pokemon/{name}")
    suspend fun getPokemonDetail(
        @Path("name") name: String
    ): DetailResponse
}