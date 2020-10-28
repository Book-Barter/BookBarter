/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

import com.github.mustafaozhan.bookbarter.common.di.DependencyContainer
import org.junit.Assert.assertTrue
import org.junit.Test

class AppViewModelTest {

    private val vm = DependencyContainer.appViewModel()

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", vm.getPlatformName().contains("Android"))
    }
}
