package com.amary.poke.droid.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AbilitiesModel(
    @SerialName("ability")
    val ability: AbilityModel = AbilityModel(),
    @SerialName("is_hidden")
    val isHidden: Boolean = false,
    @SerialName("slot")
    val slot: Int = 0
)
