package com.amary.poke.droid.presentation.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amary.poke.droid.domain.usecase.LogoutUseCase
import com.amary.poke.droid.domain.usecase.ProfileUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProfileViewModel(
    private val profileUseCase: ProfileUseCase,
    private val logoutUseCase: LogoutUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<ProfileState>(ProfileState.Initial)
    val state = _state.asStateFlow()

    fun getProfile() {
        viewModelScope.launch {
            _state.value = ProfileState.Loading
            profileUseCase.invoke().collect { result ->
                result.onSuccess { user ->
                    _state.value = ProfileState.Success(user)
                }.onFailure { exception ->
                    _state.value = ProfileState.Error(exception.message ?: "Unknown error")
                }
            }
        }
    }

    fun logout() {
        viewModelScope.launch {
            _state.value = ProfileState.Loading
            logoutUseCase.invoke()
                .onSuccess {
                    _state.value = ProfileState.LoggedOut
                }
                .onFailure { exception ->
                    _state.value = ProfileState.Error(exception.message ?: "Logout failed")
                }
        }
    }
}
