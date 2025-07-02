package com.amary.poke.droid.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amary.poke.droid.domain.usecase.AuthUseCase
import com.amary.poke.droid.domain.usecase.LoginUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginUseCase: LoginUseCase,
    private val authUseCase: AuthUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<LoginState>(LoginState.Initial)
    val state = _state.asStateFlow()

    init {
        checkAuthentication()
    }

    fun checkAuthentication() {
        viewModelScope.launch {
            authUseCase.invoke()
                .onSuccess { isAuthenticated ->
                    if (isAuthenticated) {
                        _state.value = LoginState.Success
                    }
                }
                .onFailure { exception ->
                    _state.value = LoginState.Error(exception.message ?: "Authentication check failed")
                }
        }
    }

    fun login(username: String, password: String) {
        if (username.isBlank() || password.isBlank()) {
            _state.value = LoginState.Error("Username and password cannot be empty")
            return
        }

        viewModelScope.launch {
            _state.value = LoginState.Loading
            loginUseCase.invoke(username, password)
                .onSuccess {
                    _state.value = LoginState.Success
                }
                .onFailure { exception ->
                    _state.value = LoginState.Error(exception.message ?: "Unknown error")
                }
        }
    }
}
