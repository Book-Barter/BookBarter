package com.github.mustafaozhan.bookbarter.common


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
