package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.GoldResponse
import com.amary.poke.droid.domain.model.GoldModel
import org.mapstruct.Mapper


@Mapper
interface GoldMapper{
   fun map(response: GoldResponse): GoldModel
}