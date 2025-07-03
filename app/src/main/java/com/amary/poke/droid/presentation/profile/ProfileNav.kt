package com.amary.poke.droid.presentation.profile

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import org.koin.androidx.compose.koinViewModel

internal object ProfileRoute {
    const val ROUTE = "profile"
}

fun NavGraphBuilder.profileScreen(
    onNavigateBack: () -> Unit,
    onNavigateToLogin: () -> Unit
) {
    composable(route = ProfileRoute.ROUTE) {
        val viewModel: ProfileViewModel = koinViewModel()
        val state by viewModel.state.collectAsState()
        
        ProfileScreen(
            state = state,
            onGetProfile = viewModel::getProfile,
            onTapLogout = viewModel::logout,
            onLogout = onNavigateToLogin,
            onNavigateBack = onNavigateBack
        )
    }
}

internal fun NavHostController.navigateToProfile() {
    navigate(ProfileRoute.ROUTE)
}