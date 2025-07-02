package com.amary.poke.droid.domain.usecase

import com.amary.poke.droid.domain.model.UserModel
import com.amary.poke.droid.domain.repository.PokeRepository

class RegisterUseCase(
    private val repository: PokeRepository
) {
    suspend operator fun invoke(
        username: String,
        fullName: String,
        email: String,
        password: String,
    ): Result<String> {
        try {
            val checkUser = repository.isUsernameExists(username)
            if (checkUser) {
                return Result.failure(Exception("Username already exists"))
            } else {
                repository.insertUser(
                    user = UserModel(
                        userName = username,
                        fullName = fullName,
                        email = email,
                        password = password
                    )
                )
                return Result.success("Registration successful")
            }
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }
}