package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.CrystalResponse
import com.amary.poke.droid.domain.model.CrystalModel
import org.mapstruct.Mapper

@Mapper
interface CrystalMapper{
   fun map(response: CrystalResponse): CrystalModel
}