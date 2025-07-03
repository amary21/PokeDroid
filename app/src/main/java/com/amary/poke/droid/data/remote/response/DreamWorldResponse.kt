package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DreamWorldResponse(
    @SerialName("front_default")
    val frontDefault: String?,
)