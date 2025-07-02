package com.amary.poke.droid.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("id")
    val id: Int = 0,
    @ColumnInfo("user_name")
    val userName: String = "",
    @ColumnInfo("full_name")
    val fullName: String = "",
    @ColumnInfo("email")
    val email: String = "",
    @ColumnInfo("password")
    val password: String = ""
)
