package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.TypesResponse
import com.amary.poke.droid.domain.model.TypesModel
import org.mapstruct.Mapper


@Mapper
interface TypesMapper{
   fun map(response: TypesResponse): TypesModel
}