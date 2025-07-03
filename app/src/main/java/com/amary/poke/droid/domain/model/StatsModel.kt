package com.amary.poke.droid.domain.model



data class StatsModel(
    val baseStat: Int = 0,
    val effort: Int = 0,
    val stat: StatModel = StatModel(),
)