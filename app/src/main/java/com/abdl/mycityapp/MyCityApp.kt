package com.abdl.mycityapp

import android.content.ContentValues.TAG
import android.util.Log
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.abdl.mycityapp.data.CoffeeShop
import com.abdl.mycityapp.ui.screen.CategoryScreen
import com.abdl.mycityapp.ui.screen.CategoryViewModel
import com.abdl.mycityapp.ui.screen.DetailItemViewModel
import com.abdl.mycityapp.ui.screen.DetailScreen
import com.abdl.mycityapp.ui.screen.RecommendationScreen
import com.abdl.mycityapp.ui.screen.RecommendationViewModel

enum class MyCityScreen(@StringRes val section: Int) {
    CATEGORY(section = R.string.category_section),
    RECOMMENDATION(section = R.string.recommendation_section),
    DETAIL(section = R.string.detail_section)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityAppBar(
    currentScreen: MyCityScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier,
) {
    CenterAlignedTopAppBar(
        title = { Text(stringResource(currentScreen.section)) },
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityApp(
    navController: NavHostController = rememberNavController(),
    categoryViewModel: CategoryViewModel = viewModel(),
    recommendationViewModel: RecommendationViewModel = viewModel(),
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = MyCityScreen.valueOf(
        backStackEntry?.destination?.route ?: MyCityScreen.CATEGORY.name
    )
    Scaffold(
        topBar = {
            MyCityAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() })
        }
    ) { innerPadding ->
        val uiStateCategory by categoryViewModel.uiState.collectAsState()
        val uiStateRecommendation by recommendationViewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = MyCityScreen.CATEGORY.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(MyCityScreen.CATEGORY.name) {
                val restoran = stringResource(R.string.restoran)
                val makanan_khas = stringResource(R.string.makanan_khas)
                val coffee_shop = stringResource(R.string.coffee_shop)
                val destinasi_wisata = stringResource(R.string.destinasi_wisata)

                CategoryScreen(
                    viewModel = categoryViewModel,
                    modifier = Modifier.padding(4.dp),
                    onClick = { titleResId ->
                        val title = when (titleResId) {
                            R.string.restoran -> restoran
                            R.string.makanan_khas -> makanan_khas
                            R.string.coffee_shop -> coffee_shop
                            R.string.destinasi_wisata -> destinasi_wisata
                            else -> ""
                        }

                        categoryViewModel.onCategoryClicked(title)

                        navController.navigate(MyCityScreen.RECOMMENDATION.name)
                    }
                )
            }
            composable(MyCityScreen.RECOMMENDATION.name) {
                LaunchedEffect(uiStateCategory.selectedCategory) {
                    recommendationViewModel.setItemsCategory(uiStateCategory.selectedCategory)
                }

                RecommendationScreen(
                    viewModel = recommendationViewModel,
                    modifier = Modifier.padding(4.dp),
                    onClick = { titleResId ->
                        recommendationViewModel.onItemClicked(titleResId)
                        navController.navigate(MyCityScreen.DETAIL.name)
                    }
                )
            }
            composable(MyCityScreen.DETAIL.name) {
                val viewModel = DetailItemViewModel()
                val titleDetail = uiStateRecommendation.selectedTitle

                Log.d(TAG, "MyCityApp: cek items: ${uiStateRecommendation.items}")
                Log.d(TAG, "MyCityApp: cek titleDetail: $titleDetail")

                val detail = uiStateRecommendation.items.find { it.titleResId == titleDetail }

                if (detail != null) {
                    val isCoffee = detail is CoffeeShop
                    viewModel.setDetail(detail, isCoffee)
                }

                DetailScreen(viewModel = viewModel)
            }
        }
    }
}