package com.abdl.mycityapp.data

data class RecommendationUiState(
    val items: List<ListItemData> = listOf(),
    val selectedTitle: Int? = null
)
