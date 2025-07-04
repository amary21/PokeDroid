package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DetailResponse(
    @SerialName("base_experience")
    val baseExperience: Int?,
    @SerialName("height")
    val height: Int?,
    @SerialName("id")
    val id: Int?,
    @SerialName("is_default")
    val isDefault: Boolean?,
    @SerialName("location_area_encounters")
    val locationAreaEncounters: String?,
    @SerialName("name")
    val name: String?,
    @SerialName("order")
    val order: Int?,
    @SerialName("weight")
    val weight: Int?
)