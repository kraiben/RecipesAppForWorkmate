package com.gab.recipesappforworkmate.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.gab.recipesappforworkmate.R

sealed class NavItems(
    val labelResId: Int,
    val icon: ImageVector,
    val route: String
) {
    data object MainScreenNavItem: NavItems(
        labelResId = R.string.home_screen_nav_item_label,
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.route
    )
    data object SavedRecipesScreenNavItem: NavItems(
        labelResId = R.string.save_recipes_screen_nav_item_label,
        icon = Icons.Default.Save,
        route = Screens.SavedRecipesScreen.route
    )
    data object SearchRecipesScreenNavItem: NavItems(
        labelResId = R.string.search_screen_nav_item_label,
        icon = Icons.Default.Search,
        route = Screens.SearchRecipesScreen.route
    )
}