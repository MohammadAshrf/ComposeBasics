package com.example.composebasics.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composebasics.ui.theme.GymsAroundTheme
import com.example.composebasics.ui.theme.Purple40

@Composable
fun GymsScreen() {
    val vm: GymsViewModel = viewModel()

    LazyColumn() {
        items(vm.state) { gym ->
            GymItem(gym) {
                vm.toggleFavouriteState(it)
            }
        }
    }
}

/**
 *            Basic List View (Iteration)
 *
Column(Modifier.verticalScroll(rememberScrollState())) {
listOfGyms.forEach {
GymItem(it)
}
 */

@Composable
fun GymItem(gym: Gym, onClick: (Int) -> Unit) {

    // TODO ->    State Hoisting --> Single Source of Truth (b3d keda hykon f el ViewModel) + Re-usability of Composable


    val icon = if (gym.isFavourite)
        Icons.Filled.Favorite
    else {
        Icons.Filled.FavoriteBorder
    }
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            DefaultIcon(Icons.Filled.Place, Modifier.weight(0.15f), "Location Icon")
            GymDetails(gym, Modifier.weight(0.70f))
            DefaultIcon(icon, Modifier.weight(0.15f), "Favourite Gym Icon") {
                onClick(gym.id)
            }
        }
    }
}

@Composable
// TODO ->                                    Unidirectional Data Flow
fun DefaultIcon(
    icon: ImageVector,
    modifier: Modifier,
    contentDescription: String,
    onClick: () -> Unit = {}

) {

    Image(
        imageVector = icon,
        contentDescription = contentDescription,
        modifier = modifier
            .padding(8.dp)
            .clickable { onClick() },
        colorFilter = ColorFilter.tint(
            Color.DarkGray
        )
    )
}

@Composable
fun GymDetails(gym: Gym, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = gym.name,
            style = MaterialTheme.typography.headlineSmall,
            color = Purple40
        )
        CompositionLocalProvider(
            LocalContentColor provides MaterialTheme.colorScheme.onSurfaceVariant
        ) {
            Text(
                text = gym.place,
                style = MaterialTheme.typography.bodySmall
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun _GymScreenPreview() {
    GymsAroundTheme {
        GymsScreen()
    }
}
