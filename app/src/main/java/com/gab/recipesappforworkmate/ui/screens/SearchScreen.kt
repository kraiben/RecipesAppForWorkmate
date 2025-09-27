package com.gab.recipesappforworkmate.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardDoubleArrowLeft
import androidx.compose.material.icons.filled.KeyboardDoubleArrowRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gab.recipesappforworkmate.domain.entities.DishType
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import com.gab.recipesappforworkmate.ui.components.DishTypesSelector
import com.gab.recipesappforworkmate.ui.components.LoadingCircle
import com.gab.recipesappforworkmate.ui.components.RecipeShortInfo
import com.gab.recipesappforworkmate.util.GAB_CHECK

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    recipesList: List<RecipeInfoModel>?,
    totalResults: Int,
    isRecipeSaved: (Long) -> Boolean,
    onSaveRecipe: (RecipeInfoModel) -> Unit,
    onDeleteRecipe: (RecipeInfoModel) -> Unit,
    onRecipeClick: (RecipeInfoModel) -> Unit,
    onSearch: (String, DishType, Int) -> Unit,
) {
    var searchQuery by rememberSaveable { mutableStateOf("") }
    var currentChunk by rememberSaveable { mutableIntStateOf(0) }
    var selectedDishType by remember { mutableStateOf<DishType>(DishType.NONE) }
    LaunchedEffect(selectedDishType) {
        GAB_CHECK(selectedDishType)
    }
    LazyColumn(modifier = modifier) {
        item {
            SearchBar(
                modifier = Modifier.fillMaxWidth(),
                inputField = {
                    SearchBarDefaults.InputField(
                        query = searchQuery,
                        onQueryChange = { searchQuery = it },
                        onSearch = { onSearch(searchQuery, selectedDishType, currentChunk) },
                        expanded = false,
                        onExpandedChange = {}
                    )
                },
                expanded = false,
                onExpandedChange = {}
            ) { }
            DishTypesSelector(
                selectedType = selectedDishType,
                onSelect = { dt ->
                    selectedDishType = when {
                        dt == selectedDishType -> DishType.NONE
                        else -> dt
                    }
                }
            )
            Spacer(modifier = Modifier.height(36.dp))
        }
        recipesList?.let { recipes ->
            if (recipes.isEmpty()) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1f)
                    ) {
                        LoadingCircle(Modifier.size(20.dp))
                    }
                }
            } else {
                items(items = recipes.filter {
                    (selectedDishType == DishType.NONE) || it.dishTypes.any { dt -> dt.typeName == selectedDishType.typeName }
                }) { item ->
                    RecipeShortInfo(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onRecipeClick(item) },
                        recipe = item,
                        isSaved = isRecipeSaved(item.id),
                        onDeleteRecipe = onDeleteRecipe,
                        onSaveRecipe = onSaveRecipe
                    )
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardDoubleArrowLeft,
                            modifier = Modifier.size(60.dp),
                            contentDescription = "seek to previous page"
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardDoubleArrowRight,
                            modifier = Modifier.size(60.dp),
                            contentDescription = "seek to next page"
                        )
                    }
                }
            }
        } ?: item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "Network error occurred",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }

    }
}