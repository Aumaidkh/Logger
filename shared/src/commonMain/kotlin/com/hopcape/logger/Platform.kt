package com.hopcape.logger

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform