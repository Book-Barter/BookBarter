package com.github.mustafaozhan.bookbarter.common

import kotlin.test.Test
import kotlin.test.assertTrue

class GreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("JS"), "Check JS is mentioned")
    }
}