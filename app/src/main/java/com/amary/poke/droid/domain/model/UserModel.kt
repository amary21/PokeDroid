package com.amary.poke.droid.domain.model


data class UserModel(
    val id: Int = 0,
    val userName: String = "",
    val fullName: String = "",
    val email: String = "",
    val password: String = ""
)
