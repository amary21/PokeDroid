package com.amary.poke.droid.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AbilityModel(
    @SerialName("name")
    val name: String = "",
    @SerialName("url")
    val url: String = ""
)
