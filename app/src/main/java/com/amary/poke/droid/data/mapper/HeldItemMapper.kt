package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.HeldItemResponse
import com.amary.poke.droid.domain.model.HeldItemModel
import org.mapstruct.Mapper


@Mapper(
    uses = [
        ItemMapper::class,
        VersionDetailMapper::class
    ]
)
interface HeldItemMapper{
   fun map(response: HeldItemResponse): HeldItemModel
}