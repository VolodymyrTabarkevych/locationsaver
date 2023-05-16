package ua.tabarkevych.locationsaver.feature.users.di

import org.koin.dsl.module
import ua.tabarkevych.locationsaver.feature.users.data.UsersRepository
import ua.tabarkevych.locationsaver.feature.users.domain.IUsersRepository
import ua.tabarkevych.locationsaver.feature.users.domain.usecase.GetAllUsersUseCase

fun usersModule() = module {
    single<IUsersRepository> { UsersRepository() }

    single { GetAllUsersUseCase(get()) }
}