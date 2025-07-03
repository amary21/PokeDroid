package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VersionGroupDetailResponse(
    @SerialName("level_learned_at")
    val levelLearnedAt: Int?,
    @SerialName("move_learn_method")
    val moveLearnMethod: MoveLearnMethodResponse?,
    @SerialName("version_group")
    val versionGroup: VersionGroupResponse?
)