package com.amary.poke.droid.presentation.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amary.poke.droid.domain.usecase.ListPokemonUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ListViewModel(
    private val listPokemonUseCase: ListPokemonUseCase
): ViewModel() {

    private val _state = MutableStateFlow<ListState>(ListState.Loading)
    val state = _state.asStateFlow()

    fun getList() = viewModelScope.launch {
        listPokemonUseCase.invoke().collect { result ->
            _state.value = ListState.Loading
            result.onSuccess {
                _state.value = ListState.Success(it)
            }.onFailure { exception ->
                _state.value = ListState.Error(exception.message.toString())
            }
        }
    }

}
