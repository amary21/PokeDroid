package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OtherResponse(
    @SerialName("dream_world")
    val dreamWorld: DreamWorldResponse?,
    @SerialName("home")
    val home: HomeResponse?,
    @SerialName("official-artwork")
    val officialArtwork: OfficialArtworkResponse?,
    @SerialName("showdown")
    val showdown: ShowdownResponse?
)