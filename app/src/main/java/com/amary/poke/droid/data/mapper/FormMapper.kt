package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.FormResponse
import com.amary.poke.droid.domain.model.FormModel
import org.mapstruct.Mapper


@Mapper
interface FormMapper{
   fun map(response: FormResponse): FormModel
}