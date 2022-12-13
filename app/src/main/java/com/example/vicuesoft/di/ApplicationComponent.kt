package com.example.vicuesoft.di

import android.app.Application
import com.example.vicuesoft.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [DataModule::class,
        RemoteModule::class,
        ViewModelModule::class]
)
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)


    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}