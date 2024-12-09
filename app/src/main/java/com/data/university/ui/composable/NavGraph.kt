package com.data.university.ui.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.data.university.ui.screens.mainScreen.MainScreen
import com.data.university.ui.screens.onBoardingScreen.OnBoardingScreen
import com.data.university.utils.NavDestinations

@Composable
fun NavGraph(navController: NavHostController, padding: PaddingValues) {
    NavHost(
        navController = navController, startDestination = NavDestinations.ONBOARDING.name
    ) {
        composable(NavDestinations.ONBOARDING.name) {
            EnterAnimation {
                OnBoardingScreen(navController = navController)
            }
        }
        composable(NavDestinations.MAIN.name) {
            EnterAnimation {
                MainScreen()
            }
        }
    }
}