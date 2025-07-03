package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.HomeResponse
import com.amary.poke.droid.domain.model.HomeModel
import org.mapstruct.Mapper


@Mapper
interface HomeMapper{
   fun map(response: HomeResponse): HomeModel
}