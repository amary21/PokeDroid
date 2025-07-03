package com.amary.poke.droid.domain.model



data class VersionsModel(
    val generationI: GenerationIModel = GenerationIModel(),
    val generationIi: GenerationIiModel = GenerationIiModel(),
    val generationIii: GenerationIiiModel = GenerationIiiModel(),
    val generationIv: GenerationIvModel = GenerationIvModel(),
    val generationV: GenerationVModel = GenerationVModel(),
    val generationVi: GenerationViModel = GenerationViModel(),
    val generationVii: GenerationViiResponse = GenerationViiResponse(),
    val generationViii: GenerationViiiModel = GenerationViiiModel(),
)