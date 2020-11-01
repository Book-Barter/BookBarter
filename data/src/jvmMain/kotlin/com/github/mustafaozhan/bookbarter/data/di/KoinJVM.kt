/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data.di

import org.koin.core.Koin
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.parameter.parametersOf
import kotlin.reflect.KClass

fun initKoinJVM(appModule: Module? = null) = startKoin {
    if (appModule == null) {
        modules(dataModule)
    } else {
        modules(appModule, dataModule)
    }
}

fun <T> Koin.getJVM(clazz: KClass<*>): T {
    return get(clazz, null) { parametersOf(clazz.simpleName) } as T
}
