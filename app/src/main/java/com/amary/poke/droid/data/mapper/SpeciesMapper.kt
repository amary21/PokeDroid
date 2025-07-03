package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.SpeciesResponse
import com.amary.poke.droid.domain.model.SpeciesModel
import org.mapstruct.Mapper


@Mapper
interface SpeciesMapper{
   fun map(response: SpeciesResponse): SpeciesModel
}