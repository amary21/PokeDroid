package com.amary.poke.droid.domain.model



data class GenerationIiModel(
    val crystal: CrystalModel = CrystalModel(),
    val gold: GoldModel = GoldModel(),
    val silver: SilverModel = SilverModel()
)