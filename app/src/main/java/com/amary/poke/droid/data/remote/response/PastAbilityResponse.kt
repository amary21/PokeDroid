package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PastAbilityResponse(
    @SerialName("generation")
    val generation: GenerationResponse?
)