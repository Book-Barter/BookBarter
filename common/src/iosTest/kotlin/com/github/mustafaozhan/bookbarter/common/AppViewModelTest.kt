/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import com.github.mustafaozhan.bookbarter.common.viewmodel.AppViewModel
import kotlin.test.Test
import kotlin.test.assertTrue

class AppViewModelTest {
    private val vm = AppViewModel()

    @Test
    fun testExample() {
        assertTrue(vm.getPlatformName().contains("iOS"), "Check iOS is mentioned")
    }
}
