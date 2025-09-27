package com.gab.recipesappforworkmate.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.gab.recipesappforworkmate.di.ApplicationComponent
import com.gab.recipesappforworkmate.ui.screens.MainComponent
import com.gab.recipesappforworkmate.ui.theme.RecipesAppForWorkmateTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    private val component: ApplicationComponent by lazy {
        (application as RecipesApplication).component
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        component.inject(this)
        setContent {
            RecipesAppForWorkmateTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainComponent(modifier = Modifier.fillMaxSize(), viewModelFactory)
                }
            }
        }
    }
}