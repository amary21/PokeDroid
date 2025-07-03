package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.TypeResponse
import com.amary.poke.droid.domain.model.TypeModel
import org.mapstruct.Mapper


@Mapper
interface TypeMapper{
   fun map(response: TypeResponse): TypeModel
}