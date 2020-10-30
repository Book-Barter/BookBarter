/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui

import com.github.mustafaozhan.bookbarter.ui.di.DependencyContainer
import org.junit.Assert.assertTrue
import org.junit.Test

class AppViewModelTest {

    private val vm = DependencyContainer.appViewModel()

    @Test
    fun testExample() {
        assertTrue("Check JVM is mentioned", vm.getPlatformName().contains("JVM"))
    }
}
