package com.gab.recipesappforworkmate.di


import com.gab.recipesappforworkmate.data.filework.DatabaseRepositoryImpl
import com.gab.recipesappforworkmate.data.network.NetworkRepositoryImpl
import com.gab.recipesappforworkmate.domain.repositories.DatabaseRepository
import com.gab.recipesappforworkmate.domain.repositories.NetworkRepository
import dagger.Binds
import dagger.Module

@Module
interface ApplicationModule {

    @Binds
    @ApplicationScope
    fun bindDatabaseRepository(imp: DatabaseRepositoryImpl): DatabaseRepository
    @Binds
    @ApplicationScope
    fun bindNetworkRepository(imp: NetworkRepositoryImpl): NetworkRepository

}