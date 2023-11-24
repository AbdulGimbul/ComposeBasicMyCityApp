package com.abdl.mycityapp.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.abdl.mycityapp.data.CoffeeShop
import com.abdl.mycityapp.data.ListItemData
import com.abdl.mycityapp.ui.component.DetailCoffee
import com.abdl.mycityapp.ui.component.DetailItem

@Composable
fun DetailScreen(viewModel: DetailItemViewModel = viewModel()){
    val uiState by viewModel.uiState.collectAsState()

    if (uiState.isCoffee){
        DetailCoffee(detailCoffeeShop = uiState.item as CoffeeShop)
    } else {
        uiState.item?.let { DetailItem(detail = it) }
    }
}