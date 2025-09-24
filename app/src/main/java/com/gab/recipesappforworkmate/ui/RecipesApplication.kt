package com.gab.recipesappforworkmate.ui

import android.app.Application
import com.gab.recipesappforworkmate.di.ApplicationComponent
import com.gab.recipesappforworkmate.di.DaggerApplicationComponent

class RecipesApplication: Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

}