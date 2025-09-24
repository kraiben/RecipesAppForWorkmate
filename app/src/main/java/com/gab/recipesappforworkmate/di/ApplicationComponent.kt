package com.gab.recipesappforworkmate.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [ApplicationModule::class]
)
interface ApplicationComponent {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}