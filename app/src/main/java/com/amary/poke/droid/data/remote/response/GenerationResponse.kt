package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationResponse(
    @SerialName("name")
    val name: String?,
    @SerialName("url")
    val url: String?
)