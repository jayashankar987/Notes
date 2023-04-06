package com.jaya.simplenotes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform