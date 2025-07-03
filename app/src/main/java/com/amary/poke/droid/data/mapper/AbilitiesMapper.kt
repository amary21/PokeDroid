package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.AbilitiesResponse
import com.amary.poke.droid.domain.model.AbilitiesModel
import org.mapstruct.Mapper

@Mapper
interface AbilitiesMapper {
    fun map(response: AbilitiesResponse): AbilitiesModel
}