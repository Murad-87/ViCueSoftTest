package com.example.vicuesoft.di

import androidx.lifecycle.ViewModel
import com.example.vicuesoft.presentation.ViCueSoftViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ViCueSoftViewModel::class)
    fun bindViCueSoftViewModel(viewModel: ViCueSoftViewModel): ViewModel
}