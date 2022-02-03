package com.felipedeveloper.compose.model

/*
    Created by Felipe Huamani on 28/01/2022.
    Email: jhuamani@solera.pe 
      
    Solera Mobile 
*/

data class MediaItem(
    val id: Int,
    val title: String,
    val thumb: String,
    val type: Type
) {
    enum class Type { PHOTO, VIDEO }
}

fun getMedia() = (1..10).map {
    MediaItem(
        id = it,
        title = "title $it",
        thumb = "https://pbs.twimg.com/media/E_Wuk2WXEAEY_fA.jpg",
        type = if (it % 3 == 0) MediaItem.Type.VIDEO else MediaItem.Type.PHOTO
    )
}