package ua.tabarkevych.locationsaver.feature.users.domain

import kotlinx.coroutines.flow.Flow
import ua.tabarkevych.locationsaver.feature.users.domain.model.User

interface IUsersRepository {

    fun getAllUsers(): Flow<List<User>>
}