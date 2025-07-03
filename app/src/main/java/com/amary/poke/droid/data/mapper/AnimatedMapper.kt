package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.AnimatedResponse
import com.amary.poke.droid.domain.model.AnimatedModel
import org.mapstruct.Mapper

@Mapper
interface AnimatedMapper{
   fun map(response: AnimatedResponse): AnimatedModel
}