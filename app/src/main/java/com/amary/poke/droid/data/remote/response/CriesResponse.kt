package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CriesResponse(
    @SerialName("latest")
    val latest: String?,
    @SerialName("legacy")
    val legacy: String?
)