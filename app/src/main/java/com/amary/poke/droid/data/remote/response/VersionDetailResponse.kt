package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VersionDetailResponse(
    @SerialName("rarity")
    val rarity: Int?,
    @SerialName("version")
    val version: VersionResponse?
)