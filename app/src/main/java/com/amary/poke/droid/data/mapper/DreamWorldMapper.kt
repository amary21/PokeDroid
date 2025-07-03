package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.DreamWorldResponse
import com.amary.poke.droid.domain.model.DreamWorldModel
import org.mapstruct.Mapper

@Mapper
interface DreamWorldMapper{
   fun map(response: DreamWorldResponse): DreamWorldModel
}