package com.gab.recipesappforworkmate.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gab.recipesappforworkmate.domain.models.DishType
import com.gab.recipesappforworkmate.domain.models.RecipeInfoModel
import com.gab.recipesappforworkmate.ui.components.DishTypesSelector
import com.gab.recipesappforworkmate.ui.components.LoadingCircle
import com.gab.recipesappforworkmate.ui.components.RecipeShortInfo

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    recipesList: List<RecipeInfoModel>?,
    isRecipeSaved: (Long) -> Boolean,
    onSaveRecipe: (RecipeInfoModel) -> Unit,
    onDeleteRecipe: (RecipeInfoModel) -> Unit,
    onRecipeClick: (RecipeInfoModel) -> Unit,
) {
    var selectedDishType by remember { mutableStateOf<DishType>(DishType.NONE) }
    LaunchedEffect(selectedDishType) {
    }
    LazyColumn(modifier = modifier) {
        item {
            Text(
                "Recipes you could like",
                modifier = Modifier
                    .padding(24.dp)
                    .wrapContentSize(Alignment.TopStart),
                style = MaterialTheme.typography.titleLarge,
            )
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