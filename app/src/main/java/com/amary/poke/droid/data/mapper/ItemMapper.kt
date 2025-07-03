package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.ItemResponse
import com.amary.poke.droid.domain.model.ItemModel
import org.mapstruct.Mapper


@Mapper
interface ItemMapper{
   fun map(response: ItemResponse): ItemModel
}