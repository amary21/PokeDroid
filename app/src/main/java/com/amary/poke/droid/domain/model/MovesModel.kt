package com.amary.poke.droid.domain.model



data class MovesModel(
    val move: MoveModel = MoveModel(),
    val versionGroupDetails: List<VersionGroupDetailModel> = emptyList()
)