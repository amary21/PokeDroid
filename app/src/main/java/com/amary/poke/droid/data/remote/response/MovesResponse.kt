package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MovesResponse(
    @SerialName("move")
    val move: MoveResponse?,
    @SerialName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetailResponse>?
)