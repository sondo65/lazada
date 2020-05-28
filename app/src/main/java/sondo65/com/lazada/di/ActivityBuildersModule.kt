package sondo65.com.lazada.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sondo65.com.lazada.views.main.MainActivity

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity() : MainActivity
}