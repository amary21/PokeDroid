package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TypesResponse(
    @SerialName("slot")
    val slot: Int?,
    @SerialName("type")
    val type: TypeResponse?
)