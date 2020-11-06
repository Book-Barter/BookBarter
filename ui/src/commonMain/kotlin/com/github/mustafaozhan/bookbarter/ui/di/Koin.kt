/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.di

import com.github.mustafaozhan.bookbarter.data.di.initKoin
import org.koin.core.module.Module

fun initKoin(appModule: Module? = null) = if (appModule == null) {
    initKoin(uiModule)
} else {
    initKoin(appModule, uiModule)
}

expect val uiModule: Module
