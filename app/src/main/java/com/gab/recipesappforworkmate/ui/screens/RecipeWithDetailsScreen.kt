package com.gab.recipesappforworkmate.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import com.gab.recipesappforworkmate.ui.components.ClosableColumnWithTitle
import com.gab.recipesappforworkmate.ui.components.ClosableDescription
import com.gab.recipesappforworkmate.ui.components.IngredientInfo
import com.gab.recipesappforworkmate.ui.components.InstructionsStepInfo

@Composable
fun RecipeWithDetailsScreen(
    modifier: Modifier = Modifier,
    recipe: RecipeInfoModel,
) {

    LazyColumn(
        modifier = modifier.background(color = MaterialTheme.colorScheme.background)
            .padding(horizontal = 16.dp)
    ) {
        item {
            AsyncImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.5f),
                contentScale = ContentScale.FillWidth,
                model = recipe.recipeImageUri,
                contentDescription = "recipe image"
            )
            Spacer(modifier = Modifier.height(30.dp))
            val shape = remember { RoundedCornerShape(12) }
            Column(
                modifier = Modifier
//                    .clip(shape)
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.onBackground,
                        shape
                    )
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.padding(24.dp),
                    text = recipe.title,
                    style = MaterialTheme.typography.titleMedium,
                    textAlign = TextAlign.Center
                )
                Text(
                    modifier = Modifier,
                    text = "cooking time: ${recipe.cookingTimeInMinutes} min",
                    style = MaterialTheme.typography.titleSmall,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(24.dp))
            }
            Spacer(modifier = Modifier.height(30.dp))
            ClosableDescription(
                titleText = "Summary",
                descriptionText = recipe.summaryDescription,
                modifier = Modifier.wrapContentSize()
            )
            Spacer(modifier = Modifier.height(30.dp))
            val ingredientItemModifier = remember {
                Modifier
            }
            val ingredientsListItemColors =
                ListItemDefaults.colors(containerColor = Color.Transparent)
            ClosableColumnWithTitle(
                title = "Ingredients",
                items = recipe.ingredients,
            ) { ingredient ->
                IngredientInfo(
                    modifier = ingredientItemModifier,
                    ingredient,
                    ingredientsListItemColors
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            val stepItemModifier = remember {
                Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
            }
            ClosableColumnWithTitle(
                title = "Steps",
                items = recipe.instructions,
            ) { step ->
                InstructionsStepInfo(
                    modifier = stepItemModifier, step = step
                )
            }
        }
    }
}