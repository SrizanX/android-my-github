package com.srizan.mygithub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.srizan.details.navigation.detailsScreen
import com.srizan.details.navigation.navigateToDetailsScreen
import com.srizan.list.listScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "list"

) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        listScreen(
            onRepoItemClick = { userName ->
                navController.navigateToDetailsScreen(userName)
            }
        )
        detailsScreen()
    }
}