package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.CriesResponse
import com.amary.poke.droid.domain.model.CriesModel
import org.mapstruct.Mapper

@Mapper
interface CriesMapper{
   fun map(response: CriesResponse): CriesModel
}