import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication
import top.notbe.phosphor.Phosphor
import top.notbe.phosphor.phosphor.All
import top.notbe.phosphor.phosphor.Bold
import top.notbe.phosphor.phosphor.Duotone
import top.notbe.phosphor.phosphor.Fill
import top.notbe.phosphor.phosphor.Light
import top.notbe.phosphor.phosphor.Regular
import top.notbe.phosphor.phosphor.Thin
import top.notbe.phosphor.phosphor.thin.Airplane

fun main() {
    singleWindowApplication {
        var selectedIndex by remember { mutableStateOf(0) }
        var iconList by remember { mutableStateOf(Phosphor.Regular.All) }
        Column {
            TabRow(selectedTabIndex = selectedIndex) {
                repeat(6) { time ->
                    Tab(
                        selected = selectedIndex == time,
                        onClick = {
                            selectedIndex = time
                            iconList = when (time) {
                                0 -> Phosphor.Thin.All
                                1 -> Phosphor.Light.All
                                2 -> Phosphor.Regular.All
                                3 -> Phosphor.Bold.All
                                4 -> Phosphor.Fill.All
                                else -> Phosphor.Duotone.All
                            }
                        }
                    ) {
                        Text(
                            text = when (time) {
                                0 -> "Thin"
                                1 -> "Light"
                                2 -> "Regular"
                                3 -> "Bold"
                                4 -> "Fill"
                                else -> "Duotone"
                            },
                            modifier = Modifier.padding(vertical = 10.dp)
                        )
                    }
                }
            }
            LazyVerticalGrid(columns = GridCells.Adaptive(30.dp)) {
                items(items = iconList, key = { it.name }) {
                    Icon(imageVector = it, contentDescription = null)
                }
            }

            Icon(imageVector = Phosphor.Thin.Airplane,contentDescription = null)
        }
    }
}