package com.amary.poke.droid.domain.model

data class DetailModel(
    val abilities: List<AbilitiesModel> = emptyList(),
    val baseExperience: Int = 0,
    val cries: CriesModel = CriesModel(),
    val forms: List<FormModel> = emptyList(),
    val gameIndices: List<GameIndiceModel> = emptyList(),
    val height: Int = 0,
    val heldItems: List<HeldItemModel> = emptyList(),
    val id: Int = 0,
    val isDefault: Boolean = false,
    val locationAreaEncounters: String = "",
    val moves: List<MovesModel> = emptyList(),
    val name: String = "",
    val order: Int = 0,
    val pastAbilities: List<PastAbilityModel> = emptyList(),
    val species: SpeciesModel = SpeciesModel(),
    val sprites: SpritesModel = SpritesModel(),
    val stats: List<StatsModel> = emptyList(),
    val types: List<TypesModel> = emptyList(),
    val weight: Int = 0
)