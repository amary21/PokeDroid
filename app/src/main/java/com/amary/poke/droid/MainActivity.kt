package com.amary.poke.droid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.amary.poke.droid.presentation.detail.detailScreen
import com.amary.poke.droid.presentation.detail.navigateToDetail
import com.amary.poke.droid.presentation.list.listScreen
import com.amary.poke.droid.presentation.list.navigateToList
import com.amary.poke.droid.presentation.login.LoginRoute
import com.amary.poke.droid.presentation.login.loginScreen
import com.amary.poke.droid.presentation.login.navigateToLogin
import com.amary.poke.droid.presentation.profile.profileScreen
import com.amary.poke.droid.presentation.profile.navigateToProfile
import com.amary.poke.droid.presentation.register.registerScreen
import com.amary.poke.droid.presentation.register.navigateToRegister
import com.amary.poke.droid.presentation.theme.PokeDroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokeDroidTheme {
                AppNavigation(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = LoginRoute.ROUTE,
        modifier = modifier
    ) {
        loginScreen(
            onLoginSuccess = navController::navigateToList,
            onNavigateToRegister = navController::navigateToRegister
        )
        registerScreen(
            onRegisterSuccess = navController::navigateToLogin,
            onNavigateBack = navController::popBackStack
        )
        listScreen(
            onNavigateToProfile = navController::navigateToProfile,
            onNavigateToDetail = navController::navigateToDetail
        )
        profileScreen(
            onNavigateToLogin = navController::navigateToLogin,
            onNavigateBack = navController::popBackStack
        )
        detailScreen(
            onNavigateBack = navController::popBackStack
        )
    }
}
