package com.abdl.mycityapp.ui.screen

import androidx.lifecycle.ViewModel
import com.abdl.mycityapp.data.DetailItemUiState
import com.abdl.mycityapp.data.ListItemData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailItemViewModel: ViewModel() {
    private val _uiState =
        MutableStateFlow(DetailItemUiState())
    val uiState: StateFlow<DetailItemUiState> = _uiState.asStateFlow()

    fun setDetail(detail: ListItemData, isCoffee: Boolean){
        _uiState.value = _uiState.value.copy(item = detail, isCoffee = isCoffee)
    }
}