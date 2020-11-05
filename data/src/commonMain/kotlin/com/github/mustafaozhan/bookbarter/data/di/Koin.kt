/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data.di

import com.github.mustafaozhan.bookbarter.data.repository.PlatformRepository
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

fun initKoin(appModule: Module? = null) = startKoin {
    if (appModule == null) {
        modules(dataModule)
    } else {
        modules(appModule, dataModule)
    }
}

var dataModule: Module = module {
    single { PlatformRepository() }
}
