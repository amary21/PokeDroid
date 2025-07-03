package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.ShowdownResponse
import com.amary.poke.droid.domain.model.ShowdownModel
import org.mapstruct.Mapper

@Mapper
interface ShowdownMapper{
   fun map(response: ShowdownResponse): ShowdownModel
}