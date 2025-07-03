package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class YellowResponse(
    @SerialName("back_default")
    val backDefault: String?,
    @SerialName("back_gray")
    val backGray: String?,
    @SerialName("back_transparent")
    val backTransparent: String?,
    @SerialName("front_default")
    val frontDefault: String?,
    @SerialName("front_gray")
    val frontGray: String?,
    @SerialName("front_transparent")
    val frontTransparent: String?
)