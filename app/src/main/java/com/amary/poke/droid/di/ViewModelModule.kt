package com.amary.poke.droid.di

import com.amary.poke.droid.presentation.list.ListViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        ListViewModel(get())
    }
}