package com.amary.poke.droid.presentation.home

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.amary.poke.droid.presentation.components.ProgressDialog
import com.amary.poke.droid.presentation.detail.DetailState
import com.amary.poke.droid.presentation.list.ListScreen
import com.amary.poke.droid.presentation.list.ListState
import com.amary.poke.droid.presentation.profile.ProfileScreen
import com.amary.poke.droid.presentation.profile.ProfileState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    listState: ListState,
    profileState: ProfileState,
    detailState: DetailState,
    onGetDetail: (name: String) -> Unit = {},
    onGetListItem: (offset: Int) -> Unit = {},
    onGetProfile: () -> Unit = {},
    onTapLogout: () -> Unit = {},
    onNavigateToDetail: (name: String) -> Unit = {},
    onNavigateToLogin: () -> Unit = {},
) {
    var tabIndex by remember { mutableIntStateOf(0) }
    val tabs = listOf("List", "Profile")

    var searchQuery by remember { mutableStateOf("") }
    var isSearchActive by remember { mutableStateOf(false) }

    BackHandler {  }

    Scaffold(
        topBar = {
            Column {
                if (tabIndex == 0) {
                    SearchBar(
                        inputField = {
                            SearchBarDefaults.InputField(
                                query = searchQuery,
                                onQueryChange = { searchQuery = it },
                                onSearch = onGetDetail,
                                expanded = isSearchActive,
                                onExpandedChange = { isSearchActive = it },
                                placeholder = { Text("Search Pokémon") },
                                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                                trailingIcon = {
                                    if (searchQuery.isNotEmpty()) {
                                        IconButton(onClick = { searchQuery = "" }) {
                                            Icon(Icons.Default.Close, contentDescription = "Clear")
                                        }
                                    }
                                },
                                colors = SearchBarDefaults.colors().inputFieldColors
                            )
                        },
                        expanded = isSearchActive,
                        onExpandedChange = { isSearchActive = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        colors = SearchBarDefaults.colors()
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            when (detailState) {
                                is DetailState.Loading -> {
                                    ProgressDialog(
                                        isShowing = true,
                                        message = "Loading profile..."
                                    )
                                }
                                is DetailState.Success -> {
                                    val data = (detailState as DetailState.Success).data
                                    Text(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable {
                                                onNavigateToDetail(data.name)
                                            },
                                        text = data.name
                                    )
                                }
                                is DetailState.Error -> {
                                    Text(
                                        text = (detailState as DetailState.Error).message,
                                        color = MaterialTheme.colorScheme.error,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(horizontal = 16.dp)
                                            .align(Alignment.Center)
                                    )
                                }
                                is DetailState.Initial -> {}
                            }
                        }
                    }
                } else {
                    TopAppBar(
                        title = { Text("PokéDroid") }
                    )
                }

                TabRow(selectedTabIndex = tabIndex) {
                    tabs.forEachIndexed { index, title ->
                        Tab(
                            text = { Text(title) },
                            selected = tabIndex == index,
                            onClick = { tabIndex = index }
                        )
                    }
                }
            }
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
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
