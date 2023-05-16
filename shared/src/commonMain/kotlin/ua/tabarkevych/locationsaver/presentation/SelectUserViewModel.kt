package ua.tabarkevych.locationsaver.presentation

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.stateIn
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState
import kotlinx.coroutines.flow.SharingStarted
import ua.tabarkevych.locationsaver.feature.users.domain.usecase.GetAllUsersUseCase

class SelectUserViewModel(
    private val getAllUsersUseCase: GetAllUsersUseCase
) : KMMViewModel() {

    @NativeCoroutinesState
    val users = getAllUsersUseCase()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())
}