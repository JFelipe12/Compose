package com.felipedeveloper.compose.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.felipedeveloper.compose.model.MediaItem

/*
    Created by Felipe Huamani on 29/01/2022.
    Email: jhuamani@solera.pe 
      
    Solera Mobile 
*/

@ExperimentalFoundationApi
@Composable
fun MainScreen(onMediaClick : (MediaItem) -> Unit) {
    Scaffold(
        topBar = { MainAppBar() }
    ) { padding ->
        MediaListGrid(onMediaClick = onMediaClick ,modifier = Modifier.padding(padding))
    }
}