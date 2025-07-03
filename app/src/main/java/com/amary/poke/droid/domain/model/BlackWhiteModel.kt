package com.amary.poke.droid.domain.model

data class BlackWhiteModel(
    val animated: AnimatedModel = AnimatedModel(),
    val backDefault: String = "",
    val backShiny: String = "",
    val frontDefault: String = "",
    val frontShiny: String = "",
)