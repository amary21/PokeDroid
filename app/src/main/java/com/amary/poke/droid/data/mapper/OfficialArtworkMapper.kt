package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.OfficialArtworkResponse
import com.amary.poke.droid.domain.model.OfficialArtworkModel
import org.mapstruct.Mapper


@Mapper
interface OfficialArtworkMapper{
   fun map(response: OfficialArtworkResponse): OfficialArtworkModel
}