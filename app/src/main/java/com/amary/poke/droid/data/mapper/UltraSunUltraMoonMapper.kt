package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.UltraSunUltraMoonResponse
import com.amary.poke.droid.domain.model.UltraSunUltraMoonModel
import org.mapstruct.Mapper


@Mapper
interface UltraSunUltraMoonMapper{
   fun map(response: UltraSunUltraMoonResponse): UltraSunUltraMoonModel
}