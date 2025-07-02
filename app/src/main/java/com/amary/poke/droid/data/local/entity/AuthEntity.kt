package com.amary.poke.droid.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "auth")
data class AuthEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo("id")
    val id: Int = 0,
)
