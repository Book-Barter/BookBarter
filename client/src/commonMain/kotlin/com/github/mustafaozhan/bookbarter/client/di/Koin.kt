/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.client.di

import com.github.mustafaozhan.bookbarter.data.di.initKoin
import org.koin.core.module.Module

fun initKoin(appModule: Module? = null) = if (appModule == null) {
    initKoin(clientModule)
} else {
    initKoin(appModule, clientModule)
}

expect val clientModule: Module
