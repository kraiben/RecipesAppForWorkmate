package com.gab.recipesappforworkmate.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gab.recipesappforworkmate.domain.entities.DishType

@Composable
fun DishTypesSelector(
    modifier: Modifier = Modifier,
    selectedType: DishType,
    onSelect: (DishType) -> Unit,
) {
    val dishTypesToSelect = remember {
        listOf(
            DishType.MAIN_COURSE, DishType.SIDE_DISH, DishType.DESSERT, DishType.APPETIZER,
            DishType.SALAD, DishType.BREAD, DishType.BREAKFAST, DishType.SOUP, DishType.BEVERAGE,
            DishType.SAUCE, DishType.MARINADE, DishType.FINGERFOOD, DishType.SNACK, DishType.DRINK,
        )
    }
    val inputLabelChipModifier = remember {
        Modifier
            .padding(4.dp)
            .wrapContentSize(Alignment.CenterStart)
    }
    val inputChipColors = InputChipDefaults.inputChipColors(
        selectedContainerColor = MaterialTheme.colorScheme.primaryContainer,
        disabledContainerColor = MaterialTheme.colorScheme.background
    )

    LazyRow(
        modifier = modifier
    ) {
        if (selectedType != DishType.NONE) {
            item {
                InputChip(
                    selected = true,
                    colors = inputChipColors,
                    label = {
                        Text(
                            text = selectedType.typeName,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            modifier = inputLabelChipModifier
                        )
                    },
                    onClick = {
                        onSelect(selectedType)

                    }
                )
            }
        }
        items(items = dishTypesToSelect, key = {it.typeName}) {dishType ->
            if (dishType != selectedType) {
                Spacer(modifier = Modifier.width(4.dp))
                InputChip(
                    selected = false,
                    colors = inputChipColors,
                    label = {
                        Text(
                            text = dishType.typeName,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            modifier = inputLabelChipModifier
                        )
                    },
                    onClick = { onSelect(dishType) }
                )
            }
        }
    }
}