package com.amary.poke.droid.presentation.home

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.amary.poke.droid.presentation.list.ListViewModel
import com.amary.poke.droid.presentation.profile.ProfileViewModel
import org.koin.androidx.compose.koinViewModel

internal object HomeRoute {
    const val ROUTE = "home"
}

fun NavGraphBuilder.homeScreen(
    onNavigateToDetail: (name: String) -> Unit = {},
    onNavigateToLogin: () -> Unit = {}
) {
    composable(route = HomeRoute.ROUTE) {
        val listViewModel: ListViewModel = koinViewModel()
        val listState by listViewModel.state.collectAsState()

        val profileViewModel: ProfileViewModel = koinViewModel()
        val profileState by profileViewModel.state.collectAsState()


        HomeScreen(
            listState = listState,
            profileState = profileState,
            onGetListItem = listViewModel::getList,
            onGetProfile = profileViewModel::getProfile,
            onTapLogout = profileViewModel::logout,
            onNavigateToDetail = onNavigateToDetail,
            onNavigateToLogin = onNavigateToLogin,
        )
    }
}

internal fun NavHostController.navigateToHome() {
    navigate(HomeRoute.ROUTE)
}
