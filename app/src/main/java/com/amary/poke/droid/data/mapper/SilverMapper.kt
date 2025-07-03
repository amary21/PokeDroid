package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.SilverResponse
import com.amary.poke.droid.domain.model.SilverModel
import org.mapstruct.Mapper


@Mapper
interface SilverMapper{
   fun map(response: SilverResponse): SilverModel
}