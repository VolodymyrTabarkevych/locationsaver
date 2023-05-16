package ua.tabarkevych.locationsaver.feature.users.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ua.tabarkevych.locationsaver.feature.users.domain.IUsersRepository
import ua.tabarkevych.locationsaver.feature.users.domain.model.User

class UsersRepository : IUsersRepository {

    override fun getAllUsers(): Flow<List<User>> {
        return flow {
            emit(listOf(User("Mike"), User("Tom"), User("Jake"), User("Finn")))
        }
    }
}