package com.amary.poke.droid.presentation.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amary.poke.droid.domain.model.ResultModel
import com.amary.poke.droid.presentation.components.ProgressDialog

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(
    state: ListState,
    onGetListItem: (offset: Int) -> Unit = {},
    onItemClick: (ResultModel) -> Unit,
) {

    LaunchedEffect(key1 = Unit) {
        onGetListItem(10)
    }

    Box(modifier = Modifier.fillMaxSize()) {
        when (state) {
            is ListState.Loading -> {
                ProgressDialog(
                    isShowing = true,
                    message = "Loading Pokémon..."
                )
            }

            is ListState.Success -> {
                PokemonList(
                    items = state.list,
                    offset = state.offset,
                    onGetListItem = onGetListItem,
                    onItemClick = onItemClick
                )
            }

            is ListState.Error -> {
                Text(
                    text = state.message,
                    color = MaterialTheme.colorScheme.error,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .align(Alignment.Center)
                )
            }
        }
    }
}

@Composable
fun PokemonList(
    items: List<ResultModel>,
    offset: Int,
    onGetListItem: (Int) -> Unit,
    onItemClick: (ResultModel) -> Unit,
) {
    val lastIndex = items.lastIndex

    LazyColumn {
        itemsIndexed(items) { index, item ->
            PokemonItem(item = item, onItemClick = onItemClick)

            if (index == lastIndex && offset > 10) {
                onGetListItem(offset)
            }
        }
        items(items) { item ->
            PokemonItem(
                item = item,
                onItemClick = onItemClick
            )
        }
    }
}

@Composable
fun PokemonItem(
    item: ResultModel,
    onItemClick: (ResultModel) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onItemClick(item) },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Text(
            text = item.name,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview
@Composable
fun ListScreenPreview() {
    ListScreen(
        state = ListState.Success(
            listOf(
                ResultModel(
                    name = "Bulbasaur",
                    url = "https://pokeapi.co/api/v2/pokemon/1/"
                ),
                ResultModel(
                    name = "Charmander",
                    url = "https://pokeapi.co/api/v2/pokemon/4/"
                )
            )
        ),
        onItemClick = {}
    )
}
