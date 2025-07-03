package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.EmeraldResponse
import com.amary.poke.droid.domain.model.EmeraldModel
import org.mapstruct.Mapper


@Mapper
interface EmeraldMapper{
   fun map(response: EmeraldResponse): EmeraldModel
}