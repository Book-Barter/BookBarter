/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import com.github.mustafaozhan.bookbarter.common.repository.PlatformRepository
import org.junit.Assert.assertTrue
import org.junit.Test

class JVMTest {

    @Test
    fun testExample() {
        assertTrue("Check JVM is mentioned", PlatformRepository().name.contains("JVM"))
    }
}
