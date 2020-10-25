/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import com.github.mustafaozhan.bookbarter.common.di.ViewModelInjector
import org.junit.Assert.assertTrue
import org.junit.Test

class AppViewModelTest {

    private val vm = ViewModelInjector.appViewModel()

    @Test
    fun testExample() {
        assertTrue("Check JVM is mentioned", vm.getPlatformName().contains("JVM"))
    }
}
