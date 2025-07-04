package com.amary.poke.droid.presentation.list

import com.amary.poke.droid.domain.model.ResultModel

sealed class ListState {
    object Loading: ListState()
    data class Success(
        val list: List<ResultModel>,
        val offset: Int = 0
    ): ListState()
    data class Error(val message: String): ListState()
}