package com.krpvn.shoppinglist.di

import android.app.Application
import com.krpvn.shoppinglist.data.AppDatabase
import com.krpvn.shoppinglist.data.ShopListDao
import com.krpvn.shoppinglist.data.ShopListRepositoryImpl
import com.krpvn.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideShopListDao(
            application: Application
        ): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}
