package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DetailResponse(
    @SerialName("abilities")
    val abilities: List<AbilitiesResponse>?,
    @SerialName("base_experience")
    val baseExperience: Int?,
    @SerialName("cries")
    val cries: CriesResponse?,
    @SerialName("forms")
    val forms: List<FormResponse>?,
    @SerialName("game_indices")
    val gameIndices: List<GameIndiceResponse>?,
    @SerialName("height")
    val height: Int?,
    @SerialName("held_items")
    val heldItems: List<HeldItemResponse>?,
    @SerialName("id")
    val id: Int?,
    @SerialName("is_default")
    val isDefault: Boolean?,
    @SerialName("location_area_encounters")
    val locationAreaEncounters: String?,
    @SerialName("moves")
    val moves: List<MovesResponse>?,
    @SerialName("name")
    val name: String?,
    @SerialName("order")
    val order: Int?,
    @SerialName("past_abilities")
    val pastAbilities: List<PastAbilityResponse>?,
    @SerialName("species")
    val species: SpeciesResponse?,
    @SerialName("sprites")
    val sprites: SpritesResponse?,
    @SerialName("stats")
    val stats: List<StatsResponse>?,
    @SerialName("types")
    val types: List<TypesResponse>?,
    @SerialName("weight")
    val weight: Int?
)