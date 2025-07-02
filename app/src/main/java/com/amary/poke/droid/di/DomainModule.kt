package com.amary.poke.droid.di

import com.amary.poke.droid.domain.usecase.AuthUseCase
import com.amary.poke.droid.domain.usecase.ListPokemonUseCase
import com.amary.poke.droid.domain.usecase.LoginUseCase
import com.amary.poke.droid.domain.usecase.LogoutUseCase
import com.amary.poke.droid.domain.usecase.ProfileUseCase
import com.amary.poke.droid.domain.usecase.RegisterUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { ListPokemonUseCase(get()) }
    factory { LoginUseCase(get()) }
    factory { LogoutUseCase(get()) }
    factory { ProfileUseCase(get()) }
    factory { RegisterUseCase(get()) }
    factory { AuthUseCase(get()) }
}