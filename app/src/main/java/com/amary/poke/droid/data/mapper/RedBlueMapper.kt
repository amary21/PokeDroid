package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.RedBlueResponse
import com.amary.poke.droid.domain.model.RedBlueModel
import org.mapstruct.Mapper


@Mapper
interface RedBlueMapper{
   fun map(response: RedBlueResponse): RedBlueModel
}