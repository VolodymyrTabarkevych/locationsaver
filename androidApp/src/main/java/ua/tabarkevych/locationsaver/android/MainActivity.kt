package ua.tabarkevych.locationsaver.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.getViewModel
import ua.tabarkevych.locationsaver.android.core.DevicePreviews
import ua.tabarkevych.locationsaver.feature.users.domain.model.User
import ua.tabarkevych.locationsaver.presentation.SelectUserViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenRoute()
        }
    }
}

@Composable
fun ScreenRoute() {
    val viewModel = getViewModel<SelectUserViewModel>()
    val users by viewModel.users.collectAsStateWithLifecycle()
    Screen(users = users)
}

@Composable
fun Screen(users: List<User>) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        users.forEach { user ->
            Text(text = user.name)
        }
    }
}

@DevicePreviews
@Composable
fun ScreenPreview() {
    Screen(users = listOf(User("Volodya")))
}