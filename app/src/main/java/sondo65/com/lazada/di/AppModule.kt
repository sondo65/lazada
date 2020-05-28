package sondo65.com.lazada.di

import dagger.Module
import dagger.Provides
import sondo65.com.lazada.ImageLoader

@Module
class AppModule {

    @Provides
    fun provideImageLoader() = ImageLoader()
}