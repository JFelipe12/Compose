package com.felipedeveloper.compose.ui.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

/*
    Created by Felipe Huamani on 29/01/2022.
    Email: jhuamani@solera.pe 
      
    Solera Mobile 
*/

sealed class NavItem(
    val baseRoute : String ,
    val navArg : List<NavArg> = emptyList()
){

    val route = run {
        val argKeys = navArg.map { "{${it.key}}"}
        listOf(baseRoute)
            .plus(argKeys)
            .joinToString("/")
    }

    val args = navArg.map {
        navArgument(it.key) { type = it.navType }
    }

    object Main : NavItem("main")

    object Detail : NavItem("detail", listOf(NavArg.MediaId)){
        fun createNavRoute(mediaId : Int) = "$baseRoute/$mediaId"
    }

}

enum class NavArg(val key : String, val navType : NavType<*>) {
    MediaId("mediaId", NavType.IntType)
}
