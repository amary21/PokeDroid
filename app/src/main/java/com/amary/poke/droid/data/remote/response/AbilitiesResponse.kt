package com.amary.poke.droid.data.remote.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AbilitiesResponse(
    @SerialName("ability")
    val ability: AbilityResponse?,
    @SerialName("is_hidden")
    val isHidden: Boolean?,
    @SerialName("slot")
    val slot: Int?
)
