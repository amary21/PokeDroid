package com.amary.poke.droid.presentation.detail

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import org.koin.androidx.compose.koinViewModel

internal object DetailRoute {
    const val ROUTE = "detail"
}

fun NavGraphBuilder.detailScreen(
    onNavigateBack: () -> Unit = {}
) {
    composable(
        route = "${DetailRoute.ROUTE}?name={name}",
        arguments = listOf(
            navArgument("name") { type = NavType.StringType },
        )
    ) {
        val name = it.arguments?.getString("name")
        val viewModel: DetailViewModel = koinViewModel()
        val state by viewModel.state.collectAsState()

        LaunchedEffect(key1 = Unit) {
            viewModel.getDetail(name.orEmpty())
        }

        DetailScreen(
            state = state,
            onNavigateBack = onNavigateBack
        )
    }
}

internal fun NavHostController.navigateToDetail(name: String) {
    navigate("${DetailRoute.ROUTE}?name=$name")
}