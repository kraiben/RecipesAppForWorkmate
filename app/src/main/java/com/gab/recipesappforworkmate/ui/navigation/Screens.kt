package com.gab.recipesappforworkmate.ui.navigation

import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel

sealed class Screens(val route: String) {

    data object HomeScreen: Screens(ROUTE_HOME_SCREEN)
    data object SavedRecipesScreen: Screens(ROUTE_SAVED_RECIPES_SCREEN)
    data object SearchRecipesScreen: Screens(ROUTE_SEARCH_RECIPES_SCREEN)

    data object RecipeDetailsScreen: Screens(ROUTE_RECIPE_DETAILS_SCREEN) {
        private const val ROUTE_FOR_ARGS = "ROUTE_RECIPE_DETAILS_SCREEN"

        fun getRouteWithArgs(recipe: RecipeInfoModel): String {
            val json = recipe.toJson()
            return "$ROUTE_FOR_ARGS/$json"
        }
    }

    companion object {
        const val ROUTE_HOME_SCREEN = "ROUTE_HOME_SCREEN"
        const val ROUTE_SAVED_RECIPES_SCREEN = "ROUTE_SAVED_RECIPES_SCREEN"
        const val ROUTE_SEARCH_RECIPES_SCREEN = "ROUTE_SEARCH_RECIPES_SCREEN"

        const val KEY_RECIPE_DETAILS = "KEY_RECIPE_DETAILS"
        const val ROUTE_RECIPE_DETAILS_SCREEN = "ROUTE_RECIPE_DETAILS_SCREEN/{$KEY_RECIPE_DETAILS}"
    }
}