package com.amary.poke.droid.domain.model



data class VersionDetailModel(
    val rarity: Int = 0,
    val version: VersionModel = VersionModel(),
)