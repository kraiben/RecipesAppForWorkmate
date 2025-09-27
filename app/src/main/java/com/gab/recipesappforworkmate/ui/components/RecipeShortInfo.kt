package com.gab.recipesappforworkmate.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Download
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel

@Composable
fun RecipeShortInfo(
    modifier: Modifier = Modifier,
    recipe: RecipeInfoModel,
    isSaved: Boolean = false,
    onSaveRecipe: (RecipeInfoModel) -> Unit = {},
    onDeleteRecipe: (RecipeInfoModel) -> Unit = {},
) {
    val shape = RoundedCornerShape(12)
    Column(
        modifier = modifier
            .clip(shape = shape)
            .border(1.dp, color = MaterialTheme.colorScheme.onBackground, shape)
//            .aspectRatio(1.25f)
            .wrapContentHeight()
            .fillMaxWidth()
            .background(
                color = Color.Transparent,
            )
    ) {
        Box(

        ) {
            AsyncImage(
                model = recipe.recipeImageUri,
                contentDescription = "",
                modifier = Modifier
                    .aspectRatio(2f)
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Icon(
                modifier = Modifier
                    .padding(16.dp)
                    .size(40.dp)
                    .align(Alignment.TopEnd)
                    .clickable {
                        if (isSaved) onDeleteRecipe(recipe) else onSaveRecipe(recipe)
                    },
                contentDescription = if (isSaved) "delete recipe" else "save recipe",
                imageVector = if (isSaved) Icons.Default.Delete else Icons.Default.Download,
                tint = if (isSaved) Color.Red else MaterialTheme.colorScheme.primary
            )
        }
        Text(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
            color = MaterialTheme.colorScheme.onBackground,
            text = recipe.title,
            maxLines = 2,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = "cooking time: ${recipe.cookingTimeInMinutes} min",
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(horizontal = 16.dp),
            style = MaterialTheme.typography.titleSmall
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}