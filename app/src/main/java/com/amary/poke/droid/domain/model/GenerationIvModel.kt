package com.amary.poke.droid.domain.model



data class GenerationIvModel(
    val diamondPearl: DiamondPearlModel = DiamondPearlModel(),
    val heartgoldSoulsilver: HeartgoldSoulsilverModel = HeartgoldSoulsilverModel(),
    val platinum: PlatinumModel = PlatinumModel()
)