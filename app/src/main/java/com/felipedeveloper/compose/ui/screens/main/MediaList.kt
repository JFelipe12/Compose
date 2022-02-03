package com.felipedeveloper.compose.ui.screens.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.felipedeveloper.compose.model.MediaItem
import com.felipedeveloper.compose.model.getMedia
import com.felipedeveloper.compose.ui.screens.shared.Thumb

/*
    Created by Felipe Huamani on 29/01/2022.
    Email: jhuamani@solera.pe 
      
    Solera Mobile 
*/

//@Preview
@Composable
fun MediaListHorizontal() {
    LazyRow(
        contentPadding = PaddingValues(4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(getMedia()) { item ->
            //MediaListItem(item, navController)
        }
    }
}

//@Preview
@Composable
fun MediaListVertical() {
    LazyColumn(
        contentPadding = PaddingValues(4.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(getMedia()) { item ->
            //MediaListItem(item, navController)
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun MediaListGrid(onMediaClick: (MediaItem) -> Unit, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(8.dp),
        cells = GridCells.Adaptive(150.dp),
        modifier = modifier
    ) {
        items(getMedia()) { item ->
            MediaListItem(
                item = item,
                onClick = { onMediaClick(item) },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}


//@Preview(showBackground = true, name = "Preview Item")
@Composable
fun MediaListItem(
    item: MediaItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.clickable(onClick = onClick),
        elevation = 0.dp,
        border = BorderStroke(2.dp, Color.LightGray),
        backgroundColor = MaterialTheme.colors.primary
        //shape = RoundedCornerShape(8.dp)
    ) {
        Column {
            Thumb(item)
            Title(item)
        }
    }
}

@Composable
private fun Title(item: MediaItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            //.background(MaterialTheme.colors.secondary)
            .padding(16.dp)
    ) {
        Text(text = item.title, style = MaterialTheme.typography.h6)
    }
}


@ExperimentalFoundationApi
@Preview
@Composable
fun PreviewView() {
    MediaListGrid(onMediaClick = {})
}
