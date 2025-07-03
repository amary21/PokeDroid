package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.FireredLeafgreenResponse
import com.amary.poke.droid.domain.model.FireredLeafgreenModel
import org.mapstruct.Mapper

@Mapper
interface FireredLeafgreenMapper{
   fun map(response: FireredLeafgreenResponse): FireredLeafgreenModel
}