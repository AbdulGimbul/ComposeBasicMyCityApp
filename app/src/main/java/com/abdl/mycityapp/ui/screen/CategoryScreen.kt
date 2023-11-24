package com.abdl.mycityapp.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.abdl.mycityapp.data.DataSource
import com.abdl.mycityapp.ui.component.ListItem

@Composable
fun CategoryScreen(
    modifier: Modifier = Modifier,
    viewModel: CategoryViewModel = viewModel(),
    contentPadding: PaddingValues = PaddingValues(0.dp),
    onClick: (Int) -> Unit,
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        contentPadding = contentPadding
    ) {

        items(uiState.categories) { category ->
            ListItem(item = category, modifier = Modifier
                .padding(4.dp)
                .clickable {
                    onClick(category.titleResId)
                })
        }
    }
}

@Preview
@Composable
fun CategoryScreenPreview() {
    CategoryScreen(viewModel = CategoryViewModel(), onClick = {})
}