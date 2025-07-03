package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HeldItemResponse(
    @SerialName("item")
    val item: ItemResponse?,
    @SerialName("version_details")
    val versionDetails: List<VersionDetailResponse>?
)