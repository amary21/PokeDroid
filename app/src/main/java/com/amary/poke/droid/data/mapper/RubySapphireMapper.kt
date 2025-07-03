package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.RubySapphireResponse
import com.amary.poke.droid.domain.model.RubySapphireModel
import org.mapstruct.Mapper


@Mapper
interface RubySapphireMapper{
   fun map(response: RubySapphireResponse): RubySapphireModel
}