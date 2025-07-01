package com.amary.poke.droid.di

import com.amary.poke.droid.domain.usecase.ListPokemonUseCase
import org.koin.dsl.module

val domainModule = module {
    factory<ListPokemonUseCase> { ListPokemonUseCase(get()) }
}