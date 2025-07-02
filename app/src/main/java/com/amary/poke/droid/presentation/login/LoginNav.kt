package com.amary.poke.droid.presentation.login

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
        val state by viewModel.state.collectAsState()

        LoginScreen(
            state = state,
            onLogin = viewModel::login,
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
