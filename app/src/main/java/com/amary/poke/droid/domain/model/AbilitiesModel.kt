package com.amary.poke.droid.domain.model

data class AbilitiesModel(
    val ability: AbilityModel = AbilityModel(),
    val isHidden: Boolean = false,
    val slot: Int = 0
)