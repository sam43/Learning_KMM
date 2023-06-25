package com.example.myapplication.helper

import dev.icerock.moko.resources.StringResource

expect class Strings {
    fun get(
        id: StringResource,
        args: List<Any>
    ): String
}