/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui

import com.github.mustafaozhan.bookbarter.ui.di.ViewModelInjector
import org.junit.Assert.assertTrue
import org.junit.Test

class AppViewModelTest {

    private val vm = ViewModelInjector.appViewModel()

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", vm.getPlatformName().contains("Android"))
    }
}
