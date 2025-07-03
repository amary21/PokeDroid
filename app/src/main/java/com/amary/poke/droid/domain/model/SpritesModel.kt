package com.amary.poke.droid.domain.model



data class SpritesModel(
    val backDefault: String = "",
    val backShiny: String = "",
    val frontDefault: String = "",
    val frontShiny: String = "",
    val other: OtherModel = OtherModel(),
)