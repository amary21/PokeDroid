package com.amary.poke.droid.di

import com.amary.poke.droid.presentation.list.ListViewModel
import com.amary.poke.droid.presentation.login.LoginViewModel
import com.amary.poke.droid.presentation.profile.ProfileViewModel
import com.amary.poke.droid.presentation.register.RegisterViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { ListViewModel(get()) }
    viewModel { LoginViewModel(get(), get()) }
    viewModel { RegisterViewModel(get()) }
    viewModel { ProfileViewModel(get(), get()) }
}
