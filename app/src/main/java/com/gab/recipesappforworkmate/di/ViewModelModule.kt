package com.gab.recipesappforworkmate.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gab.recipesappforworkmate.ui.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Binds
    fun bindMainViewModel(vm: MainViewModel): ViewModel

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory



}