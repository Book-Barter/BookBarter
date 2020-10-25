/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import com.github.mustafaozhan.bookbarter.common.di.ViewModelInjector
import kotlin.test.Test
import kotlin.test.assertTrue

class AppViewModelTest {

    private val vm = ViewModelInjector.appViewModel()

    @Test
    fun testExample() {
        assertTrue(vm.getPlatformName().contains("JS"), "Check JS is mentioned")
    }
}
