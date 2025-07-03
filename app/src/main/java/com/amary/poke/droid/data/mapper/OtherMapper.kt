package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.OtherResponse
import com.amary.poke.droid.domain.model.OtherModel
import org.mapstruct.Mapper


@Mapper
interface OtherMapper{
   fun map(response: OtherResponse): OtherModel
}