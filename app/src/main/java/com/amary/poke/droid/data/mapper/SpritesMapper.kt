package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.SpritesResponse
import com.amary.poke.droid.domain.model.SpritesModel
import org.mapstruct.Mapper


@Mapper
interface SpritesMapper{
   fun map(response: SpritesResponse): SpritesModel
}