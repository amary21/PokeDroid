package com.amary.poke.droid.presentation.profile

import com.amary.poke.droid.domain.model.UserModel

sealed class ProfileState {
    object Initial : ProfileState()
    object Loading : ProfileState()
    data class Success(val user: UserModel) : ProfileState()
    data class Error(val message: String) : ProfileState()
    object LoggedOut : ProfileState()
}
