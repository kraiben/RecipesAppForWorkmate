package com.gab.recipesappforworkmate.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.gab.recipesappforworkmate.domain.models.IngredientInfoModel

@Composable
fun IngredientInfo(
    modifier: Modifier = Modifier,
    ingredient: IngredientInfoModel,
    colors: ListItemColors,
) {
    ListItem(
        colors = colors,
        modifier = modifier,
        leadingContent = {
            val context = LocalContext.current
            val imageRequest = remember {
                ImageRequest.Builder(context)
                    .data(ingredient.ingredientIconUri)
                    .build()
            }
            AsyncImage(
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(44.dp), contentDescription = null,
                model = (imageRequest)
            )
        },

        headlineContent = {
            Text(
                modifier = Modifier.wrapContentHeight(Alignment.CenterVertically),
                color = MaterialTheme.colorScheme.onBackground,
                text = ingredient.name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.titleSmall
            )
        },
        supportingContent = {
            Text(
                modifier = Modifier.wrapContentHeight(Alignment.CenterVertically),
                color = MaterialTheme.colorScheme.onBackground,
                text = ingredient.description,
//                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.bodySmall
            )
        })
}