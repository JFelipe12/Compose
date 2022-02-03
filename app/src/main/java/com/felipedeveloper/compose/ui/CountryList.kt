package com.felipedeveloper.compose.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/*
    Created by Felipe Huamani on 30/01/2022.
    Email: jhuamani@solera.pe 
      
    Solera Mobile
*/

@ExperimentalFoundationApi
@Composable
fun CountryList() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        val grouped = countries.groupBy { it[0] }

        grouped.forEach { (header, items) ->
            stickyHeader {
                Text(
                    text = header.toString(),
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(16.dp)
                )
            }
            items(items) { country ->
                Text(
                    text = country,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.subtitle1
                )
            }
        }
    }
}