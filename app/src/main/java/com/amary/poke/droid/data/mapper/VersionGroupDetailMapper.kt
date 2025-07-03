package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.VersionGroupDetailResponse
import com.amary.poke.droid.domain.model.VersionGroupDetailModel
import org.mapstruct.Mapper


@Mapper
interface VersionGroupDetailMapper{
   fun map(response: VersionGroupDetailResponse): VersionGroupDetailModel
}