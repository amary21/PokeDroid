package com.amary.poke.droid.presentation.list

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import org.koin.androidx.compose.koinViewModel

internal object ListRoute {
    const val ROUTE = "list"
}

fun NavGraphBuilder.listScreen(
    onNavigateToProfile: () -> Unit = {}
) {
    composable(route = ListRoute.ROUTE) {
        val viewModel: ListViewModel = koinViewModel()
        val state by viewModel.state.collectAsState()

        LaunchedEffect(key1 = Unit) {
            viewModel.getList()
        }

        ListScreen(
            state = state,
            onItemClick = { /* Handle item click */ },
            onNavigateToProfile = onNavigateToProfile
        )
    }
}

internal fun NavHostController.navigateToList() {
    navigate(ListRoute.ROUTE)
}
