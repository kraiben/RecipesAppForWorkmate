package com.gab.recipesappforworkmate.data.network

import com.gab.recipesappforworkmate.data.network.dto.RandomRecipesResultDto
import com.gab.recipesappforworkmate.data.network.dto.SearchRecipesResultDto
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipesApiService {
    @GET("recipes/complexSearch?${BASE_SEARCH_QUERY}")
    suspend fun searchRecipes(
        @Query("query") query: String,
        @Query("number") number: Int,
        @Query("type") type: String,
        @Query("offset") offset: Int,
        @Query("apiKey") apiKey: String = API_KEY_2
    ): SearchRecipesResultDto

    @GET("recipes/random?")
    suspend fun getRandomRecipes(
        @Query("number") number: Int,
        @Query("apiKey") apiKey: String = API_KEY
    ): RandomRecipesResultDto




    companion object {
        protected const val BASE_SEARCH_QUERY: String = "instructionsRequired=true&fillIngredients=true&addRecipeInformation=true&addRecipeInstructions=true&"
    }
}