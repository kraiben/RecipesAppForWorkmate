package com.gab.recipesappforworkmate.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gab.recipesappforworkmate.domain.models.DishType
import com.gab.recipesappforworkmate.domain.models.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.usecases.DeleteRecipeUseCase
import com.gab.recipesappforworkmate.domain.usecases.GetRandomRecipesFlowUseCase
import com.gab.recipesappforworkmate.domain.usecases.GetSavedRecipesUseCase
import com.gab.recipesappforworkmate.domain.usecases.GetSerchedRecipesUseCase
import com.gab.recipesappforworkmate.domain.usecases.IsLastPageUseCase
import com.gab.recipesappforworkmate.domain.usecases.SaveRecipeUseCase
import com.gab.recipesappforworkmate.domain.usecases.SearchRecipesUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getSavedRecipesUseCase: GetSavedRecipesUseCase,
    private val getRandomRecipesFlowUseCase: GetRandomRecipesFlowUseCase,
    private val saveRecipeUseCase: SaveRecipeUseCase,
    private val deleteRecipeUseCase: DeleteRecipeUseCase,
    private val getSearchedRecipesUseCase: GetSerchedRecipesUseCase,
    private val searchRecipesUseCase: SearchRecipesUseCase,
    private val isLastPageUseCase: IsLastPageUseCase,
) : ViewModel() {

    fun isLastPage(chunk: Int) = isLastPageUseCase(chunk)
    fun getSearchedRecipes() = getSearchedRecipesUseCase()
    fun searchRecipes(query: String, dishTypeFilter: DishType, chunk: Int) {
        viewModelScope.launch {
            searchRecipesUseCase(
                query,
                dishTypeFilter,
                chunk
            )
        }
    }

    private val savedRecipes = getSavedRecipesUseCase()
    fun getSavedRecipes() = savedRecipes

    fun getRandomRecipes(size: Int) = getRandomRecipesFlowUseCase(size)


    fun deleteRecipe(recipe: RecipeInfoModel) {
        viewModelScope.launch {
            deleteRecipeUseCase(recipe)
        }
    }

    fun saveRecipe(recipe: RecipeInfoModel) {
        viewModelScope.launch {
            saveRecipeUseCase(recipe)
        }
    }

    init {
        viewModelScope.launch {
        }
    }
}