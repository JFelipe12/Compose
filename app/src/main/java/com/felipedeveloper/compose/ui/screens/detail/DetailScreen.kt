package com.felipedeveloper.compose.ui.screens.detail

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.felipedeveloper.compose.model.getMedia
import com.felipedeveloper.compose.ui.screens.shared.ArrowBackIcon
import com.felipedeveloper.compose.ui.screens.shared.Thumb

@Composable
fun DetailScreen(mediaId: Int, onUpClick: () -> Unit) {

    val mediaItem = remember { getMedia().first { it.id == mediaId } }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = mediaItem.title) },
                navigationIcon = { ArrowBackIcon(onUpClick) }
            )
        }
    ) {
        Thumb(item = mediaItem)
    }

}