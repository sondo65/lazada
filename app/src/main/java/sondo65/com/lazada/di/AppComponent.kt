package sondo65.com.lazada.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import sondo65.com.lazada.BaseActivity

@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBuildersModule::class
])
interface AppComponent : AndroidInjector<BaseActivity>{

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(activity : Application) : Builder

        fun build() : AppComponent
    }
}