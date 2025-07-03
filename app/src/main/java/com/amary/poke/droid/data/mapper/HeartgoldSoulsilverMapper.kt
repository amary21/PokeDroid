package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.HeartgoldSoulsilverResponse
import com.amary.poke.droid.domain.model.HeartgoldSoulsilverModel
import org.mapstruct.Mapper


@Mapper
interface HeartgoldSoulsilverMapper{
   fun map(response: HeartgoldSoulsilverResponse): HeartgoldSoulsilverModel
}