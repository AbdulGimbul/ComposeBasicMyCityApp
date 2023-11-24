package com.abdl.mycityapp.ui.screen

import androidx.lifecycle.ViewModel
import com.abdl.mycityapp.data.CategoryUiState
import com.abdl.mycityapp.data.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CategoryViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CategoryUiState())
    val uiState: StateFlow<CategoryUiState> = _uiState.asStateFlow()

    init {
        _uiState.value = CategoryUiState(categories = DataSource.categories)
    }

    fun onCategoryClicked(titleResId: String) {
        _uiState.value = _uiState.value.copy(selectedCategory = titleResId)
    }
}