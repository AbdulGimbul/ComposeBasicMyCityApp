package com.abdl.mycityapp.data

data class CategoryUiState(
    val categories: List<Category> = listOf(),
    val selectedCategory: String = ""
)
