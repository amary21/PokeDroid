package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.StatsResponse
import com.amary.poke.droid.domain.model.StatsModel
import org.mapstruct.Mapper


@Mapper
interface StatsMapper{
   fun map(response: StatsResponse): StatsModel
}