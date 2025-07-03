package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIvResponse(
    @SerialName("diamond-pearl")
    val diamondPearl: DiamondPearlResponse?,
    @SerialName("heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilverResponse?,
    @SerialName("platinum")
    val platinum: PlatinumResponse?
)