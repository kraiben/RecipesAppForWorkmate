package com.gab.recipesappforworkmate.di

import android.content.Context
import com.gab.recipesappforworkmate.ui.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [ApplicationModule::class, DataModule::class, ViewModelModule::class]
)
@ApplicationScope
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}