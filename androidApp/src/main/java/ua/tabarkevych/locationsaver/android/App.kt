package ua.tabarkevych.locationsaver.android

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import ua.tabarkevych.locationsaver.android.di.appModule
import ua.tabarkevych.locationsaver.di.initKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidLogger()
            androidContext(this@App)
            modules(appModule)
        }
    }
}