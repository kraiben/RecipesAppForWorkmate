package com.gab.recipesappforworkmate.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.gab.recipesappforworkmate.domain.models.RecipeInfoModel

class NavigationState(
    val navHostController: NavHostController,
) {
    fun navigateTo(route: String) {
        navHostController.navigate(route) {
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            restoreState = true
            launchSingleTop = true
        }
    }

    fun navigateToRecipeDetails(recipe: RecipeInfoModel) {
        navHostController.navigate(Screens.RecipeDetailsScreen.getRouteWithArgs(recipe)) {}
    }
}

@Composable
fun rememberNavigationState(
    navHostController: NavHostController = rememberNavController(),
): NavigationState {
    return remember {
        NavigationState(navHostController)
    }
}