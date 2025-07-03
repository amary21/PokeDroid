package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIResponse(
    @SerialName("red-blue")
    val redBlue: RedBlueResponse?,
    @SerialName("yellow")
    val yellow: YellowResponse?
)