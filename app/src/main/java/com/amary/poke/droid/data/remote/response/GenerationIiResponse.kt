package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIiResponse(
    @SerialName("crystal")
    val crystal: CrystalResponse?,
    @SerialName("gold")
    val gold: GoldResponse?,
    @SerialName("silver")
    val silver: SilverResponse?
)