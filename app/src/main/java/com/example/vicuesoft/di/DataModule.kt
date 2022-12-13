package com.example.vicuesoft.di

import com.example.vicuesoft.data.api.ViCueSoftApi
import com.example.vicuesoft.data.repository.RepositoryImpl
import com.example.vicuesoft.data.repository.ViCueSoftMapper
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    @ApplicationScope
    fun provideViCueSoftMapper() : ViCueSoftMapper = ViCueSoftMapper()

    @Provides
    @ApplicationScope
    fun provideRepository(
        api: ViCueSoftApi,
        mapper: ViCueSoftMapper
    ) : RepositoryImpl {
        return RepositoryImpl(api, mapper)
    }
}