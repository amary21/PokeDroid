package com.amary.poke.droid.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VersionsResponse(
    @SerialName("generation-i")
    val generationI: GenerationIResponse?,
    @SerialName("generation-ii")
    val generationIi: GenerationIiResponse?,
    @SerialName("generation-iii")
    val generationIii: GenerationIiiResponse?,
    @SerialName("generation-iv")
    val generationIv: GenerationIvResponse?,
    @SerialName("generation-v")
    val generationV: GenerationVResponse?,
    @SerialName("generation-vi")
    val generationVi: GenerationViResponse?,
    @SerialName("generation-vii")
    val generationVii: GenerationViiResponse?,
    @SerialName("generation-viii")
    val generationViii: GenerationViiiResponse?
)