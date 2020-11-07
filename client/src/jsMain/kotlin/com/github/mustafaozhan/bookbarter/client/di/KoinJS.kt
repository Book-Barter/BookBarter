/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.client.di

import com.github.mustafaozhan.bookbarter.client.main.MainViewModel
import org.koin.core.Koin
import org.koin.core.module.Module
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module
import kotlin.reflect.KClass

actual val clientModule: Module = module {
    single { MainViewModel(get()) }
}

fun <T> Koin.getForJs(clazz: KClass<*>): T {
    return get(clazz, null) { parametersOf(clazz.simpleName) } as T
}
