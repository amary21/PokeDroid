package com.amary.poke.droid.di

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.amary.poke.droid.data.local.dao.PokeDao
import com.amary.poke.droid.data.local.entity.AuthEntity
import com.amary.poke.droid.data.local.entity.ResultEntity
import com.amary.poke.droid.data.local.entity.UserEntity
import org.koin.dsl.module
import org.koin.android.ext.koin.androidApplication

val localModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            PokeDatabase::class.java,
            "poke.db"
        ).allowMainThreadQueries()
            .fallbackToDestructiveMigration(false)
            .build()
    }
    single<PokeDao> { get<PokeDatabase>().pokeDao() }
}

@Database(
    entities = [
        ResultEntity::class,
        AuthEntity::class,
        UserEntity::class
   ],
    version = 2,
    exportSchema = false
)
abstract class PokeDatabase: RoomDatabase() {
    abstract fun pokeDao(): PokeDao
}