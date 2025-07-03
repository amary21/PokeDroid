package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.VersionDetailResponse
import com.amary.poke.droid.domain.model.VersionDetailModel
import org.mapstruct.Mapper


@Mapper
interface VersionDetailMapper{
   fun map(response: VersionDetailResponse): VersionDetailModel
}