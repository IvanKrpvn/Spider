package com.krpvn.shoppinglist.presentation

import android.app.Application
import com.krpvn.shoppinglist.di.DaggerApplicationComponent

class ShopApplication : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}
