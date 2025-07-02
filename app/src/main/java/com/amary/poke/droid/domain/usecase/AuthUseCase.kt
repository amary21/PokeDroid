package com.amary.poke.droid.domain.usecase

import com.amary.poke.droid.domain.repository.PokeRepository

class AuthUseCase(
    private val repository: PokeRepository
) {
    suspend operator fun invoke(): Result<Boolean> {
        return try {
            Result.success(repository.isAuthenticated())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}