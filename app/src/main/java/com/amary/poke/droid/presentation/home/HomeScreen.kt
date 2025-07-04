package com.amary.poke.droid.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.amary.poke.droid.presentation.list.ListScreen
import com.amary.poke.droid.presentation.list.ListState
import com.amary.poke.droid.presentation.profile.ProfileScreen
import com.amary.poke.droid.presentation.profile.ProfileState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    listState: ListState,
    profileState: ProfileState,
    onGetListItem: () -> Unit = {},
    onGetProfile: () -> Unit = {},
    onTapLogout: () -> Unit = {},
    onNavigateToDetail: (name: String) -> Unit = {},
    onNavigateToLogin: () -> Unit = {},
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("PokéDroid") },
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            var tabIndex by remember { mutableIntStateOf(0) }

            val tabs = listOf("List", "Profile")

            Column(modifier = Modifier.fillMaxWidth()) {
                TabRow(selectedTabIndex = tabIndex) {
                    tabs.forEachIndexed { index, title ->
                        Tab(text = { Text(title) },
                            selected = tabIndex == index,
                            onClick = { tabIndex = index }
                        )
                    }
                }
                when (tabIndex) {
                    0 -> ListScreen(
                        state = listState,
                        onGetListItem = onGetListItem,
                        onItemClick = { onNavigateToDetail(it.name) },
                    )
                    1 -> ProfileScreen(
                        state = profileState,
                        onGetProfile = onGetProfile,
                        onTapLogout = onTapLogout,
                        onLogout = onNavigateToLogin,
                    )
                }
            }
        }
    }
}