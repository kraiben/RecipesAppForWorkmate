package com.gab.recipesappforworkmate.ui.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardDoubleArrowDown
import androidx.compose.material.icons.filled.KeyboardDoubleArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ClosableDescription(
    modifier: Modifier = Modifier,
    titleText: String,
    descriptionText: String
    ) {
    var isVisible by remember {
        mutableStateOf(false)
    }
    Column(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                titleText, style = MaterialTheme.typography.titleLarge, modifier = Modifier
                    .wrapContentSize(align = Alignment.CenterStart)
            )
            AnimatedContent(
                targetState = isVisible,
                transitionSpec = {
                    (fadeIn(animationSpec = tween(delayMillis = 100)) +
                            slideInVertically(animationSpec = tween(delayMillis = 100))).togetherWith(
                        fadeOut(animationSpec = tween(delayMillis = 100)) +
                                slideOutVertically(animationSpec = tween(delayMillis = 100))
                    )
                },
                label = ""
            ) { targetState ->
                Icon(
                    imageVector = if (targetState) Icons.Default.KeyboardDoubleArrowUp else Icons.Default.KeyboardDoubleArrowDown,
                    contentDescription = if (targetState) "Ingredients visible" else "Ingredients invisible",
                    tint = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .animateContentSize()
                        .clickable { isVisible = !isVisible }
                )
            }
        }
        AnimatedVisibility(visible = isVisible) {
            HtmlText(text = descriptionText, modifier = Modifier.wrapContentSize())
        }
    }
}
