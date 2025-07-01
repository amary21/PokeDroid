package com.amary.poke.droid.data.remote.api

import com.amary.poke.droid.data.remote.response.PokeResponse
import retrofit2.http.GET

interface PokeApi {
    @GET("pokemon")
    suspend fun getPokemon(): PokeResponse
}