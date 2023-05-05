package ua.tabarkevych.locationsaver

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform