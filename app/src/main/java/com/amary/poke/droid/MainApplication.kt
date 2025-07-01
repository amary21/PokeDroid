package com.amary.poke.droid

import android.app.Application
import com.amary.poke.droid.di.domainModule
import com.amary.poke.droid.di.localModule
import com.amary.poke.droid.di.networkModule
import com.amary.poke.droid.di.repositoryModule
import com.amary.poke.droid.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MainApplication)
            modules(
                networkModule,
                localModule,
                repositoryModule,
                domainModule,
                viewModelModule
            )
        }
    }
}