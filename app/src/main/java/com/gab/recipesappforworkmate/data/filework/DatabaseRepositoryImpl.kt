package com.gab.recipesappforworkmate.data.filework

import com.gab.recipesappforworkmate.data.filework.database.RecipeDao
import com.gab.recipesappforworkmate.data.filework.entities.RecipeDishTypeCrossRef
import com.gab.recipesappforworkmate.domain.entities.RecipeInfoModel
import com.gab.recipesappforworkmate.domain.repositories.DatabaseRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

class DatabaseRepositoryImpl @Inject constructor(
    private val dao: RecipeDao,
    private val mapper: DatabaseMapper,
) : DatabaseRepository {

    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    override suspend fun saveRecipe(recipe: RecipeInfoModel) {
        coroutineScope.launch {
            with(mapper) {
                dao.insertRecipe(recipe.toEntity())
                dao.insertDishTypes(recipe.dishTypes.map { it.toEntity() })
                dao.insertRecipeDishTypes(recipe.dishTypes.map {
                    RecipeDishTypeCrossRef(
                        recipe.id,
                        it.name
                    )
                })
                dao.insertIngredients(recipe.ingredients.map { it.toEntity(recipe.id) })
                dao.insertRecipeSteps(recipe.instructions.map {
                    it.toEntity(recipe.id)
                })
            }
        }
    }

    override suspend fun deleteSavedRecipe(recipe: RecipeInfoModel) {
        TODO("Not yet implemented")
    }
    private val savedRecipesFlowNotifier = MutableSharedFlow<Unit>(replay = 1)
    private val savedRecipesFlow: StateFlow<List<RecipeInfoModel>> = flow {
        savedRecipesFlowNotifier.emit(Unit)
        savedRecipesFlowNotifier.collect {
            val recipes = dao.getAllRecipesWithDetails()
            emit(recipes.map {r -> with(mapper) {r.toInfoModel()} })
        }
    }.stateIn(coroutineScope, SharingStarted.Lazily, emptyList())

    override fun getSavedRecipes(): StateFlow<List<RecipeInfoModel>> = savedRecipesFlow
}