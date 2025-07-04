package com.amary.poke.droid.presentation.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amary.poke.droid.domain.usecase.DetailUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DetailViewModel(
    private val detailUseCase: DetailUseCase
): ViewModel() {
    private val _state = MutableStateFlow<DetailState>(DetailState.Loading)
    val state = _state.asStateFlow()

    fun getDetail(name: String) {
        viewModelScope.launch {
            if (name.isNotEmpty()) {
                _state.value = DetailState.Loading
                detailUseCase.invoke(name).collect { result ->
                    result.onSuccess {
                        _state.value = DetailState.Success(it)
                    }.onFailure { exception ->
                        _state.value = DetailState.Error(exception.message.toString())
                    }
                }
            } else {
                _state.value = DetailState.Error("Name cannot be empty")
            }
        }
    }
}