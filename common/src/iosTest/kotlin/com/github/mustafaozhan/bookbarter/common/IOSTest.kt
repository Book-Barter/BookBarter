/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import kotlin.test.Test
import kotlin.test.assertTrue

class IOSTest {

    @Test
    fun testExample() {
        assertTrue(Platform().name.contains("iOS"), "Check iOS is mentioned")
    }
}
