package com.amary.poke.droid.presentation.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import org.koin.androidx.compose.koinViewModel

internal object ProfileRoute {
    const val ROUTE = "profile"
}

fun NavGraphBuilder.profileScreen(
    onNavigateBack: () -> Unit
) {
    composable(route = ProfileRoute.ROUTE) {
        val viewModel: ProfileViewModel = koinViewModel()
        
        ProfileScreen(
            viewModel = viewModel,
            onNavigateBack = onNavigateBack
        )
    }
}

internal fun NavHostController.navigateToProfile() {
    navigate(ProfileRoute.ROUTE)
}