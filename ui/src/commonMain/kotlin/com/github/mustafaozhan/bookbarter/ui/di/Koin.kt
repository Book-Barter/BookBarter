/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.di

import com.github.mustafaozhan.bookbarter.data.di.dataModule
import org.koin.core.context.startKoin
import org.koin.core.module.Module

fun initKoin(appModule: Module? = null) = startKoin {
    if (appModule == null) {
        modules(
            platformModule,
            dataModule
        )
    } else {
        modules(
            appModule,
            platformModule,
            dataModule
        )
    }
}

expect val platformModule: Module
