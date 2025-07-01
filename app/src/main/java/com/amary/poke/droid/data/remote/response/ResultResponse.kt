package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResultResponse(
    @SerialName("name")
    val name: String? = null,
    @SerialName("url")
    val url: String? = null
)