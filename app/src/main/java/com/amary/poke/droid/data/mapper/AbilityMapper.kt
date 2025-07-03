package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.AbilityResponse
import com.amary.poke.droid.domain.model.AbilityModel
import org.mapstruct.Mapper

@Mapper
interface AbilityMapper{
    fun map(response: AbilityResponse): AbilityModel
}