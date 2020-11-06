/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data.di

import co.touchlab.kermit.CommonLogger
import co.touchlab.kermit.Kermit
import com.github.mustafaozhan.bookbarter.data.repository.PlatformRepository
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

fun initKoin(vararg appModule: Module) = startKoin {
    kermit.d { "Koin initKoin" }
    appModule.forEach { modules(it) }
    modules(dataModule)
}

val kermit = Kermit(CommonLogger()).apply { d { "Kermit initialised" } }

var dataModule: Module = module {
    single { PlatformRepository() }
    factory { kermit }
}
