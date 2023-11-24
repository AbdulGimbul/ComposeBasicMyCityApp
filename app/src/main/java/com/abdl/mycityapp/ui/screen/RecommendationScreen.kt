package com.abdl.mycityapp.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdl.mycityapp.data.Category
import com.abdl.mycityapp.data.DataSource
import com.abdl.mycityapp.data.ListItemData
import com.abdl.mycityapp.ui.component.ListItem
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RecommendationScreen(
    modifier: Modifier = Modifier,
    viewModel: RecommendationViewModel = viewModel(),
    contentPadding: PaddingValues = PaddingValues(0.dp),
    onClick: (Int) -> Unit,
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        contentPadding = contentPadding
    ) {
        items(uiState.items) { item ->
            ListItem(item = item, modifier = Modifier
                .padding(4.dp)
                .clickable {
                    onClick(item.titleResId)
                })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendationScreenPreview() {
    RecommendationScreen(viewModel = RecommendationViewModel(), onClick = {})
}