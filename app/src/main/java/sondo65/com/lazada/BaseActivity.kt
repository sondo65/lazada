package sondo65.com.lazada

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import sondo65.com.lazada.di.DaggerAppComponent

class BaseActivity : DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>
            = DaggerAppComponent.builder().application(this).build()

}