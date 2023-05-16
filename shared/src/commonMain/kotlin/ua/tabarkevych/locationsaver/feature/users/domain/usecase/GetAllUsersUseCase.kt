package ua.tabarkevych.locationsaver.feature.users.domain.usecase

import kotlinx.coroutines.flow.Flow
import ua.tabarkevych.locationsaver.core.domain.FlowUseCase
import ua.tabarkevych.locationsaver.feature.users.domain.IUsersRepository
import ua.tabarkevych.locationsaver.feature.users.domain.model.User

class GetAllUsersUseCase(
    private val usersRepository: IUsersRepository
) : FlowUseCase<Unit, List<User>> {

    override fun invoke(parameters: Unit): Flow<List<User>> {
        return usersRepository.getAllUsers()
    }
}