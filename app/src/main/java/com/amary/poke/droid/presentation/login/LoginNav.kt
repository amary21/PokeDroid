package com.amary.poke.droid.presentation.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import org.koin.androidx.compose.koinViewModel

internal object LoginRoute {
    const val ROUTE = "login"
}

fun NavGraphBuilder.loginScreen(
    onLoginSuccess: () -> Unit,
    onNavigateToRegister: () -> Unit
) {
    composable(route = LoginRoute.ROUTE) {
        val viewModel: LoginViewModel = koinViewModel()

        LoginScreen(
            viewModel = viewModel,
            onLoginSuccess = onLoginSuccess,
            onNavigateToRegister = onNavigateToRegister
        )
    }
}

internal fun NavHostController.navigateToLogin() {
    navigate(LoginRoute.ROUTE) {
        popUpTo(graph.startDestinationId) {
            inclusive = true
        }
    }
}
