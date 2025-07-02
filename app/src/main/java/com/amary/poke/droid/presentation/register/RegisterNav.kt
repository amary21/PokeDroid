package com.amary.poke.droid.presentation.register

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import org.koin.androidx.compose.koinViewModel

internal object RegisterRoute {
    const val ROUTE = "register"
}

fun NavGraphBuilder.registerScreen(
    onRegisterSuccess: () -> Unit,
    onNavigateBack: () -> Unit
) {
    composable(route = RegisterRoute.ROUTE) {
        val viewModel: RegisterViewModel = koinViewModel()
        val state by viewModel.state.collectAsState()
        
        RegisterScreen(
            state = state,
            onRegister = viewModel::register,
            onRegisterSuccess = onRegisterSuccess,
            onNavigateBack = onNavigateBack
        )
    }
}

internal fun NavHostController.navigateToRegister() {
    navigate(RegisterRoute.ROUTE)
}