package com.felipedeveloper.compose.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.felipedeveloper.compose.ui.theme.ComposeTheme

/*
    Created by Felipe Huamani on 30/01/2022.
    Email: jhuamani@solera.pe 
      
    Solera Mobile 
*/

@Composable
fun StickyHeaderApp(content: @Composable () -> Unit) {
    ComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}