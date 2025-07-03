package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.DiamondPearlResponse
import com.amary.poke.droid.domain.model.DiamondPearlModel
import org.mapstruct.Mapper

@Mapper
interface DiamondPearlMapper{
   fun map(response: DiamondPearlResponse): DiamondPearlModel
}