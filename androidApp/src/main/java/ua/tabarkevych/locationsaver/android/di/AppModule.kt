package ua.tabarkevych.locationsaver.android.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import ua.tabarkevych.locationsaver.presentation.SelectUserViewModel

val appModule = module {
    viewModelOf(::SelectUserViewModel)
}
