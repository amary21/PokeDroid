package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.VersionGroupResponse
import com.amary.poke.droid.domain.model.VersionGroupModel
import org.mapstruct.Mapper


@Mapper
interface VersionGroupMapper{
   fun map(response: VersionGroupResponse): VersionGroupModel
}