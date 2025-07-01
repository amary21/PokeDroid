package com.amary.poke.droid.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "result")
data class ResultEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo("name")
    val name: String = "",
    @ColumnInfo("url")
    val url: String = ""
)
