package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.myapplication.models.plants
import dev.icerock.moko.resources.ImageResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    //var count by remember { mutableStateOf(0) }
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = MaterialTheme.colors.primary,
                title = { Text("Plats app") }
            )
        }
    ) {
        DataList()
//        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
//            Button(
//                onClick = { count++ }
//            ) {
//                Text("Count $count")
//            }
//        }
    }
}

@ExperimentalResourceApi
@Composable
fun DataList() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp)
    ) {

        item {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .wrapContentHeight()
                    .padding(vertical = 25.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "\uD83C\uDF3F  Plants on Earth",
                    style = MaterialTheme.typography.h4
                )
            }
        }
        items(plants) { item ->
            PlantCard(item.name, item.description, item.imageRes)
        }
    }
}

@ExperimentalResourceApi
@Composable
fun PlantCard(name: String, description: String, image: ImageResource) {
    Card(
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = RoundedCornerShape(8.dp),
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
//            Image(
//                SharedRes.images.aloe_vera,
//                contentDescription = null,
//                modifier = Modifier.size(130.dp)
//                    .padding(8.dp),
//                contentScale = ContentScale.Fit,
//            )
            Column(Modifier.padding(8.dp)) {
                Text(
                    text = name,
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.onSurface,
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.body2,
                )
            }
        }
    }
}

//@Preview
//@Composable
//fun PreviewApp() {
//    val items = listOf("Item 1", "Item 2", "Item 3")
//    //App(items = items)
//}