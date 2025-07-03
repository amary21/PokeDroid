package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.MovesResponse
import com.amary.poke.droid.domain.model.MoveModel
import com.amary.poke.droid.domain.model.MovesModel
import org.mapstruct.Mapper


@Mapper(
   uses = [
      VersionGroupDetailMapper::class,
      MovesMapper::class
   ]
)
interface MovesMapper{
   fun map(response: MovesResponse): MovesModel
}