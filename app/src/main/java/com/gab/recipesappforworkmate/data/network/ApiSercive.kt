package com.gab.recipesappforworkmate.data.network

import com.gab.recipesappforworkmate.data.network.dto.SearchRecipesResultDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("recipes/complexSearch?${BASE_SEARCH_QUERY}")
    suspend fun searchRecipes(
        @Query("query") query: String,
        @Query("number") number: Int,
        @Query("offset") offset: Int,
        @Query("apiKey") apiKey: String = API_KEY
    ): Result<SearchRecipesResultDto>

    @GET("recipes/random")
    suspend fun getRandomRecipes(
        @Query("number") number: Int,
        @Query("apiKey") apiKey: String = API_KEY
    ): Result<SearchRecipesResultDto>


    companion object {
        protected const val API_KEY: String = "c631f4a7c3d04d5ea0dd6eca94bce350"
        protected const val BASE_SEARCH_QUERY: String = "instructionsRequired=true&fillIngredients=true&addRecipeInformation=true&addRecipeInstructions=true&"
    }
}