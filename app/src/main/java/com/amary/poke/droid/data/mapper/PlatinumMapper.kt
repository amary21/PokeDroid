package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.PlatinumResponse
import com.amary.poke.droid.domain.model.PlatinumModel
import org.mapstruct.Mapper


@Mapper
interface PlatinumMapper{
   fun map(response: PlatinumResponse): PlatinumModel
}