package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.YellowResponse
import com.amary.poke.droid.domain.model.YellowModel
import org.mapstruct.Mapper


@Mapper
interface YellowMapper{
   fun map(response: YellowResponse): YellowModel
}