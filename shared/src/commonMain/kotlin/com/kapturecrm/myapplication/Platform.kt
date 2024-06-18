package com.kapturecrm.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform