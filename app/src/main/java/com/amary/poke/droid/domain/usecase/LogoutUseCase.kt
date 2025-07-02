package com.amary.poke.droid.domain.usecase

import com.amary.poke.droid.domain.repository.PokeRepository

class LogoutUseCase(
    private val repository: PokeRepository
) {
    suspend operator fun invoke(): Result<String> {
        try {
            repository.logout()
            return Result.success("Logout successful")
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }
}