package com.amary.poke.droid.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.amary.poke.droid.data.local.entity.AuthEntity
import com.amary.poke.droid.data.local.entity.ResultEntity
import com.amary.poke.droid.data.local.entity.UserEntity

@Dao
interface PokeDao {
    @Query("SELECT * FROM result")
    suspend fun getAll(): List<ResultEntity>

    @Query("DELETE FROM result")
    suspend fun deleteAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(results: List<ResultEntity>)

    @Query("SELECT EXISTS(SELECT * FROM user WHERE user_name = :username)")
    suspend fun isUsernameExists(username: String): Boolean

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertUser(user: UserEntity)

    @Query("SELECT * FROM user WHERE id = :userId")
    suspend fun getUserById(userId: Int): UserEntity?

    @Query("SELECT * FROM user WHERE user_name = :username AND password = :password")
    suspend fun login(username: String, password: String): UserEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAuth(auth: AuthEntity)

    @Query("DELETE FROM auth")
    suspend fun logout()

    @Query("SELECT EXISTS(SELECT * FROM auth LIMIT 1)")
    suspend fun isAuthenticated(): Boolean

    @Query("SELECT * FROM auth LIMIT 1")
    suspend fun getAuth(): AuthEntity?
}
