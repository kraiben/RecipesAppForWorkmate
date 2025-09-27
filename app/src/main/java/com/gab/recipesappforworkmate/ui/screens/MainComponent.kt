package com.gab.recipesappforworkmate.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.gab.recipesappforworkmate.domain.entities.DishType
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import com.gab.recipesappforworkmate.ui.MainViewModel
import com.gab.recipesappforworkmate.ui.components.RecipesScaffold
import com.gab.recipesappforworkmate.ui.navigation.RecipesNavGraph
import com.gab.recipesappforworkmate.ui.navigation.rememberNavigationState

@Composable
fun MainComponent(
    modifier: Modifier = Modifier,
    viewModelFactory: ViewModelProvider.Factory,
) {
    val navigationState = rememberNavigationState()
    val viewModel = viewModel<MainViewModel>(factory = viewModelFactory)

    val onDeleteRecipe = remember { { r: RecipeInfoModel -> viewModel.deleteRecipe(r) } }
    val onSaveRecipe = remember { { r: RecipeInfoModel -> viewModel.saveRecipe(r) } }
    val searchRecipe = remember {
        { query: String, dt: DishType, chunk: Int ->
            viewModel.searchRecipes(
                query,
                dt,
                chunk
            )
        }
    }
    val randomRecipes by viewModel.getRandomRecipes(25).collectAsState()
    val searchTotalResults by viewModel.getTotalSearchResultAmount().collectAsState()
    val searchedRecipes by viewModel.getSearchedRecipes().collectAsState()
    val savedRecipes by viewModel.getSavedRecipes().collectAsState()
    val isRecipeSaved = remember { { id: Long -> savedRecipes?.any { it.id == id } ?: false } }
    RecipesScaffold(navigationState = navigationState, modifier = modifier) { paddingValues ->
        RecipesNavGraph(
            navHostController = navigationState.navHostController,
            {
                HomeScreen(
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize(),
                    recipesList = randomRecipes,
                    isRecipeSaved = isRecipeSaved,
                    onSaveRecipe = onSaveRecipe,
                    onDeleteRecipe = onDeleteRecipe,
                    onRecipeClick = remember {
                        {
                            navigationState.navigateToRecipeDetails(it)
                        }
                    }
                )
            },
            {
                SavedRecipesScreen(
                    recipesList = savedRecipes,
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize(),
                    deleteRecipe = onDeleteRecipe,
                    onRecipeClick = remember {
                        {
                            navigationState.navigateToRecipeDetails(it)
                        }
                    }
                )
            },
            {
                SearchScreen(
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize(),
                    recipesList = searchedRecipes,
                    totalResults = searchTotalResults,
                    isRecipeSaved = isRecipeSaved,
                    onSaveRecipe = onSaveRecipe,
                    onDeleteRecipe = onDeleteRecipe,
                    onRecipeClick = remember {
                        {
                            navigationState.navigateToRecipeDetails(it)
                        }
                    },
                    onSearch = searchRecipe
                )
            },
            { recipeInfoModel ->
                RecipeWithDetailsScreen(
                    modifier = Modifier.fillMaxSize(),
                    recipe = recipeInfoModel,
                )
            })
    }
}