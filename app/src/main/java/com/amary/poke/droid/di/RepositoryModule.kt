package com.amary.poke.droid.di

import com.amary.poke.droid.data.repository.PokeRepositoryImpl
import com.amary.poke.droid.domain.repository.PokeRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<PokeRepository> {
        PokeRepositoryImpl(
            pokeApi = get(),
            pokeDao = get()
        )
    }
}