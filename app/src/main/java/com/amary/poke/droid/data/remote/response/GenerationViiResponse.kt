package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationViiResponse(
    @SerialName("icons")
    val icons: IconsResponse?,
    @SerialName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoonResponse?
)