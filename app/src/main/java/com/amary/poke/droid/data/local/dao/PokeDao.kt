package com.amary.poke.droid.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.amary.poke.droid.data.local.entity.ResultEntity

@Dao
interface PokeDao {
    @Query("SELECT * FROM result")
    fun getAll(): List<ResultEntity>

    @Query("DELETE FROM result")
    suspend fun deleteAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(results: List<ResultEntity>)
}
