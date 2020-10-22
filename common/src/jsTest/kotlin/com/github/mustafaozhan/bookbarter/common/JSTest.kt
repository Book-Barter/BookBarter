/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import com.github.mustafaozhan.bookbarter.common.repository.PlatformRepository
import kotlin.test.Test
import kotlin.test.assertTrue

class JSTest {

    @Test
    fun testExample() {
        assertTrue(PlatformRepository().name.contains("JS"), "Check JS is mentioned")
    }
}
