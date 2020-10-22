/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import com.github.mustafaozhan.bookbarter.common.repository.PlatformRepository
import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", PlatformRepository().name.contains("Android"))
    }
}
