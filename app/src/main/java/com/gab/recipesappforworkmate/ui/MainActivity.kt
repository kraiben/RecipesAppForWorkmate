package com.gab.recipesappforworkmate.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gab.recipesappforworkmate.di.ApplicationComponent
import com.gab.recipesappforworkmate.domain.repositories.DatabaseRepository
import com.gab.recipesappforworkmate.domain.repositories.NetworkRepository
import com.gab.recipesappforworkmate.ui.theme.RecipesAppForWorkmateTheme
import com.gab.recipesappforworkmate.util.GAB_CHECK
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    private val component: ApplicationComponent by lazy {
        (application as RecipesApplication).component
    }

    @Inject
    lateinit var exps: Exps

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        component.inject(this)
        setContent {
            RecipesAppForWorkmateTheme {

            }
        }
    }
}

class Exps @Inject constructor(
    private val databaseRepository: DatabaseRepository,
    private val networkRepository: NetworkRepository
) {
    private val cs = CoroutineScope(Dispatchers.IO)
    init {
        cs.launch {
            networkRepository.searchRecipes("pasta", 3, 2)
            networkRepository.getSearchedRecipesFlow().collect {
                GAB_CHECK(it.size)
                it.forEach {r ->
                    databaseRepository.saveRecipe(r)
                }
            }
        }
        cs.launch {
            databaseRepository.getSavedRecipes().collect {
                GAB_CHECK(it)
            }
        }
    }
}