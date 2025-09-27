package com.gab.recipesappforworkmate.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import com.gab.recipesappforworkmate.ui.navigation.NavItems
import com.gab.recipesappforworkmate.ui.navigation.NavigationState

@Composable
fun RecipesScaffold(
    modifier: Modifier = Modifier,
    navigationState: NavigationState,
    content: @Composable (PaddingValues) -> Unit
) {

    Scaffold(
        modifier = modifier.navigationBarsPadding(),
        bottomBar = {
            BottomAppBar(containerColor = MaterialTheme.colorScheme.secondaryContainer) {
                val navBackStackEntry by navigationState
                    .navHostController.currentBackStackEntryAsState()
                val items = listOf(
                    NavItems.MainScreenNavItem,
                    NavItems.SearchRecipesScreenNavItem,
                    NavItems.SavedRecipesScreenNavItem
                )
                items.forEach { item ->
                    val selected = navBackStackEntry?.destination?.hierarchy?.any {
                        it.route == item.route
                    } ?: false
                    NavigationBarItem(
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = MaterialTheme.colorScheme.secondaryContainer
                        ),
                        selected = selected,
                        onClick = {
                            if (!selected) {
                                navigationState.navigateTo(item.route)
                            }
                        },
                        label = {
                            Text(
                                color = MaterialTheme.colorScheme.primary,
                                text = stringResource(id = item.labelResId)
                            )
                        },
                        icon = {
                            Icon(
                                item.icon,
                                contentDescription = null,
                                modifier = Modifier.size(32.dp),
                                tint = if (selected) {
                                    MaterialTheme.colorScheme.primary
                                } else MaterialTheme.colorScheme.onBackground
                            )
                        }
                    )
                }
            }
        },
        content = content
    )

}