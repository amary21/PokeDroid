package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.MoveLearnMethodResponse
import com.amary.poke.droid.domain.model.MoveLearnMethodModel
import org.mapstruct.Mapper


@Mapper
interface MoveLearnMethodMapper{
   fun map(response: MoveLearnMethodResponse): MoveLearnMethodModel
}