package com.amary.poke.droid.presentation.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amary.poke.droid.domain.usecase.RegisterUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RegisterViewModel(
    private val registerUseCase: RegisterUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<RegisterState>(RegisterState.Initial)
    val state = _state.asStateFlow()

    fun register(username: String, fullName: String, email: String, password: String) {
        if (username.isBlank() || fullName.isBlank() || email.isBlank() || password.isBlank()) {
            _state.value = RegisterState.Error("All fields are required")
            return
        }

        if (!isValidEmail(email)) {
            _state.value = RegisterState.Error("Invalid email format")
            return
        }

        viewModelScope.launch {
            _state.value = RegisterState.Loading
            registerUseCase.invoke(username, fullName, email, password)
                .onSuccess {
                    _state.value = RegisterState.Success
                }
                .onFailure { exception ->
                    _state.value = RegisterState.Error(exception.message ?: "Unknown error")
                }
        }
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}