package com.amary.poke.droid.domain.model



data class OtherModel(
    val dreamWorld: DreamWorldModel = DreamWorldModel(),
    val home: HomeModel = HomeModel(),
    val officialArtwork: OfficialArtworkModel = OfficialArtworkModel(),
    val showdown: ShowdownModel = ShowdownModel()
)