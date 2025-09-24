package com.gab.recipesappforworkmate.di

import android.content.Context
import androidx.room.Room
import com.gab.recipesappforworkmate.data.filework.database.RecipeDao
import com.gab.recipesappforworkmate.data.filework.database.RecipeDatabase
import com.gab.recipesappforworkmate.data.network.RecipesApiService
import com.gab.recipesappforworkmate.data.network.SPOON_BASE_URL
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

@Module
class DataModule {
    @ApplicationScope
    @Provides
    fun provideDatabase(context: Context): RecipeDatabase {
        return Room.databaseBuilder(context, RecipeDatabase::class.java, name = "database.db")
            .build()
    }

    @ApplicationScope
    @Provides
    fun provideMusicDao(musicDataBase: RecipeDatabase): RecipeDao {
        return musicDataBase.recipeDao()
    }
    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
            .build()

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(SPOON_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

    @Provides
    fun provideApiService(retrofit: Retrofit): RecipesApiService = retrofit.create<RecipesApiService>()
}