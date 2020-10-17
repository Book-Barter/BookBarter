/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import org.junit.Assert.assertTrue
import org.junit.Test

class JVMTest {

    @Test
    fun testExample() {
        assertTrue("Check JVM is mentioned", Greeting().greeting().contains("JVM"))
    }
}
