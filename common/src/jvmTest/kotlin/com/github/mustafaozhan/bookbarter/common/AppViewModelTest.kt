/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import com.github.mustafaozhan.bookbarter.common.viewmodel.AppViewModel
import org.junit.Assert.assertTrue
import org.junit.Test

class AppViewModelTest {

    private val vm = AppViewModel()

    @Test
    fun testExample() {
        assertTrue("Check JVM is mentioned", vm.getPlatformName().contains("JVM"))
    }
}
