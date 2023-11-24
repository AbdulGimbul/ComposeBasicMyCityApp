package com.abdl.mycityapp.ui.screen

import androidx.lifecycle.ViewModel
import com.abdl.mycityapp.data.DataSource
import com.abdl.mycityapp.data.RecommendationUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RecommendationViewModel : ViewModel() {
    private val _iuState =
        MutableStateFlow(RecommendationUiState())
    val uiState: StateFlow<RecommendationUiState> = _iuState.asStateFlow()

    fun setItemsCategory(category: String) {
        val items =
            when (category) {
                COFFEE_SHOP -> DataSource.coffeeShops
                RESTAURANT -> DataSource.restaurants
                TOURISM_SPOT -> DataSource.tourismSpots
                LOCAL_PRODUCT -> DataSource.localProducts
                else -> listOf()
            }

        _iuState.value = _iuState.value.copy(items = items)
    }

    fun onItemClicked(title: Int) {
        _iuState.value = _iuState.value.copy(selectedTitle = title)
    }

    companion object {
        const val RESTAURANT = "Restoran"
        const val LOCAL_PRODUCT = "Makanan Khas"
        const val COFFEE_SHOP = "Coffee Shop"
        const val TOURISM_SPOT = "Destinasi Wisata"
    }
}