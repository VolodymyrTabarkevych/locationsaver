package ua.tabarkevych.locationsaver.di

import org.koin.dsl.module

actual fun platformModule() = module {
/*    single<OkHttpClient> {
        OkHttpClient.Builder()
            .apply {
                if (BuildConfig.DEBUG) {
                    eventListenerFactory(LoggingEventListener.Factory())
                }
            }
            .build()
    }
    factory<ApolloClient.Builder> {
        ApolloClient.Builder().okHttpClient(get())
    }
    single<ImageLoader> {
        ImageLoader.Builder(androidContext())
            .okHttpClient { get() }
            .build()
    }
    single<AnalyticsLogger> {
        if (BuildConfig.DEBUG) {
            AndroidLoggingAnalyticsLogger
        } else {
            FirebaseAnalyticsLogger
        }
    }*/
}

//val Context.settingsStore by preferencesDataStore("settings")