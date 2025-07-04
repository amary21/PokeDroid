package com.amary.poke.droid.presentation.detail

import com.amary.poke.droid.domain.model.DetailModel

sealed class DetailState {
    object Loading: DetailState()
    data class Success(val data: DetailModel): DetailState()
    data class Error(val message: String): DetailState()
}