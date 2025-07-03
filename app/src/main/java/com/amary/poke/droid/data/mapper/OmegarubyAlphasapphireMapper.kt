package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.OmegarubyAlphasapphireResponse
import com.amary.poke.droid.domain.model.OmegarubyAlphasapphireModel
import org.mapstruct.Mapper


@Mapper
interface OmegarubyAlphasapphireMapper{
   fun map(response: OmegarubyAlphasapphireResponse): OmegarubyAlphasapphireModel
}