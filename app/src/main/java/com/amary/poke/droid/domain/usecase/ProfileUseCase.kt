package com.amary.poke.droid.domain.usecase

import com.amary.poke.droid.domain.model.UserModel
import com.amary.poke.droid.domain.repository.PokeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ProfileUseCase(
    private val repository: PokeRepository
) {
    operator fun invoke(): Flow<Result<UserModel>> = flow {
        try {
            val auth = repository.getAuth()
            auth?.let {
                val user = repository.getUserById(it.id)
                user?.let {
                    emit(Result.success(it))
                } ?: run {
                    emit(Result.failure(Exception("User not found")))
                }
            } ?: run {
                emit(Result.failure(Exception("Auth not found")))
            }
        } catch (e: Exception) {
            emit(Result.failure(e))
        }
    }
}