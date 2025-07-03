package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.AbilitiesResponse
import com.amary.poke.droid.data.remote.response.BlackWhiteResponse
import com.amary.poke.droid.domain.model.BlackWhiteModel
import org.mapstruct.Mapper

@Mapper
interface BlackWhiteMapper{
   fun map(response: BlackWhiteResponse): BlackWhiteModel
}