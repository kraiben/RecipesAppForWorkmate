package com.gab.recipesappforworkmate.di


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
interface ApplicationModule {

    companion object {

        @Provides
        @ApplicationScope
        fun provideOkHttpClient(): OkHttpClient =
            OkHttpClient.Builder()
                .addInterceptor(
                    HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    })
                .build()

        @Provides
        @ApplicationScope
        fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
            Retrofit.Builder()
                .baseUrl(SPOON_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()


        @ApplicationScope
        @Provides
        fun provideApiService(retrofit: Retrofit): RecipesApiService = retrofit.create<RecipesApiService>()
    }
}