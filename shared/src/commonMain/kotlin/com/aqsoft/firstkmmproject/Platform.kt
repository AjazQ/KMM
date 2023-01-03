package com.aqsoft.firstkmmproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform