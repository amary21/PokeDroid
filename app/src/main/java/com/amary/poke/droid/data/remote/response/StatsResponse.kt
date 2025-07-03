package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatsResponse(
    @SerialName("base_stat")
    val baseStat: Int?,
    @SerialName("effort")
    val effort: Int?,
    @SerialName("stat")
    val stat: StatResponse?
)