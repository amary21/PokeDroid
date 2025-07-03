package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.IconsResponse
import com.amary.poke.droid.domain.model.IconsModel
import org.mapstruct.Mapper


@Mapper
interface IconsMapper{
   fun map(response: IconsResponse): IconsModel
}