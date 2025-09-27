package com.gab.recipesappforworkmate.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.navArgument
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel

@Composable
fun RecipesNavGraph(
    navHostController: NavHostController,
    homeScreenContent: @Composable () -> Unit,
    savedRecipesScreenContent: @Composable () -> Unit,
    searchRecipesScreenContent: @Composable () -> Unit,
    recipeDetailsScreenContent: @Composable (RecipeInfoModel) -> Unit,
) {
    NavHost(
        navController = navHostController,
        startDestination = Screens.HomeScreen.route
    ) {
        composable(route = Screens.HomeScreen.route) {
            homeScreenContent()
        }
        composable(route = Screens.SavedRecipesScreen.route) {
            savedRecipesScreenContent()
        }
        composable(route = Screens.SearchRecipesScreen.route) {
            searchRecipesScreenContent()
        }
        dialog(
            route = Screens.RecipeDetailsScreen.route,
            arguments = listOf(
                navArgument(
                    Screens.KEY_RECIPE_DETAILS
                ) {},

            ),
            dialogProperties = DialogProperties(
                usePlatformDefaultWidth = false
            )
        ) {
            val recipeJson = it.arguments?.getString(Screens.KEY_RECIPE_DETAILS)

            recipeJson?.let { r ->
                val recipe = RecipeInfoModel.fromJson(r)
                recipeDetailsScreenContent(
                    recipe
                )
            }
        }
    }
}