package com.iamhari.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.iamhari.presentation.features.profile.ui.HomeScreen
import com.iamhari.presentation.features.profile.ui.SplashScreen
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


interface NavigationDestination {
    val route: String
}


@Serializable
object SplashDestination : NavigationDestination {
    override val route = "splash"
}

@Serializable
object HomeDestination : NavigationDestination {
    override val route = "home"
}

sealed class NavigationEvent(val destination: NavigationDestination) {
    data object SplashScreen : NavigationEvent(SplashDestination)
    data object HomeScreen : NavigationEvent(HomeDestination)

}

fun NavHostController.handleNavigation(event: NavigationEvent?) {
    event?.let { navigate(it.destination.route) }
}

@Composable
fun AppNavController(
    navController: NavHostController = rememberNavController()
) {

    NavHost(navController = navController, startDestination = HomeDestination.route) {
        composable(SplashDestination.route) { SplashScreen(navController = navController) }
        composable(HomeDestination.route) { HomeScreen(navController = navController) }

    }
}

inline fun <reified T : Any> T.toJson(): String = Json.encodeToString(this)

inline fun <reified T> String.fromJson(): T = Json.decodeFromString(this)