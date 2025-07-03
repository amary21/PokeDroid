package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GameIndiceResponse(
    @SerialName("game_index")
    val gameIndex: Int?,
    @SerialName("version")
    val version: VersionResponse?
)