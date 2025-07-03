package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.StatResponse
import com.amary.poke.droid.domain.model.StatModel
import org.mapstruct.Mapper


@Mapper
interface StatMapper{
   fun map(response: StatResponse): StatModel
}