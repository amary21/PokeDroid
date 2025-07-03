package com.amary.poke.droid.domain.model



data class VersionGroupDetailModel(
    val levelLearnedAt: Int = 0,
    val moveLearnMethod: MoveLearnMethodModel = MoveLearnMethodModel(),
    val versionGroup: VersionGroupModel = VersionGroupModel(),
)