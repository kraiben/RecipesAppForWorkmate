package com.gab.recipesappforworkmate.data.filework

import com.gab.recipesappforworkmate.data.filework.database.RecipeDao
import com.gab.recipesappforworkmate.data.filework.entities.RecipeDishTypeCrossRef
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.repositories.DatabaseRepository
import com.gab.recipesappforworkmate.util.GAB_CHECK
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DatabaseRepositoryImpl @Inject constructor(
    private val dao: RecipeDao,
    private val mapper: DatabaseMapper,
) : DatabaseRepository {

    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    private val _savedRecipesFlow = MutableSharedFlow<List<RecipeInfoModel>>(replay = 1)
    private val savedRecipesFlow: StateFlow<List<RecipeInfoModel>?> = flow {
        val recipes = dao.getAllRecipesWithDetails()
        _savedRecipesFlow.emit(recipes.map { r -> with(mapper) { r.toInfoModel() } })
        _savedRecipesFlow.collect {
            emit(it)
        }
    }.stateIn(coroutineScope, SharingStarted.Lazily, null)

    override suspend fun saveRecipe(recipe: RecipeInfoModel): Unit = withContext(Dispatchers.IO) {
        withContext(Dispatchers.IO) {
            GAB_CHECK("saveRecipe $recipe")
            with(mapper) {
                val recipeId = dao.insertRecipe(recipe.toEntity())
                val dishTypesCrossRefs = recipe.dishTypes.map {
                    val dt = it.toEntity()
                    dao.insertDishType(dt)
                    RecipeDishTypeCrossRef(recipe.id, dt.name)
                }
                dao.insertRecipeDishTypes(dishTypesCrossRefs)
                dao.insertIngredients(recipe.ingredients.map { it.toEntity(recipeId) })
                dao.insertRecipeSteps(recipe.instructions.map { it.toEntity(recipeId) })
            }
            savedRecipesFlow.value?.let { srf ->
                _savedRecipesFlow.emit(
                     listOf(recipe) + srf
                )
            }
        }
    }

    override suspend fun deleteSavedRecipe(recipe: RecipeInfoModel): Unit =
        withContext(Dispatchers.IO) {
            dao.deleteRecipe(recipe.id)
            savedRecipesFlow.value?.let { srf ->
                _savedRecipesFlow.emit(
                    srf.filter { it.id != recipe.id })
            }
        }

    override fun getSavedRecipes(): StateFlow<List<RecipeInfoModel>?> = savedRecipesFlow
}