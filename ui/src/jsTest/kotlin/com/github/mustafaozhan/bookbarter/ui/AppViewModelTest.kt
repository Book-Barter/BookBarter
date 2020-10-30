/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui

import com.github.mustafaozhan.bookbarter.ui.di.DependencyContainer
import kotlin.test.Test
import kotlin.test.assertTrue

class AppViewModelTest {

    private val vm = DependencyContainer.appViewModel()

    @Test
    fun testExample() {
        assertTrue(vm.getPlatformName().contains("JS"), "Check JS is mentioned")
    }
}
