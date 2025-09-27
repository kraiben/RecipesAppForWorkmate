package com.gab.recipesappforworkmate.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gab.recipesappforworkmate.domain.models.RecipeStepInfoModel

@Composable
fun InstructionsStepInfo(
    modifier: Modifier = Modifier,
    step: RecipeStepInfoModel,
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = step.number.toString(),
            modifier = Modifier.wrapContentSize(align = Alignment.CenterStart),
            fontSize = 40.sp,
        )
        VerticalDivider(
            thickness = 1.dp,
            modifier = Modifier.width(16.dp),
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = step.description,
            modifier = Modifier.wrapContentSize(align = Alignment.CenterStart),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}