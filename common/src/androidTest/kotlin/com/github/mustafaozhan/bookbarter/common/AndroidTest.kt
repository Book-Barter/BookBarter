/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", Platform().name.contains("Android"))
    }
}
