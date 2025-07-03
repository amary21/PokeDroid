package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.MoveResponse
import com.amary.poke.droid.domain.model.MoveModel
import org.mapstruct.Mapper


@Mapper
interface MoveMapper{
   fun map(response: MoveResponse): MoveModel
}