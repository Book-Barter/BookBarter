/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

@file:Suppress("unused")
/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.di

import com.github.mustafaozhan.bookbarter.ui.main.MainViewModel
import kotlinx.cinterop.ObjCClass
import kotlinx.cinterop.getOriginalKotlinClass
import org.koin.core.Koin
import org.koin.core.KoinApplication
import org.koin.core.module.Module
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

actual val uiModule: Module = module {
    single { MainViewModel(get()) }
}

fun initIOS(): KoinApplication {
    return initKoin()
}

fun Koin.getForIOS(objCClass: ObjCClass): Any {
    val kClazz = getOriginalKotlinClass(objCClass)!!
    return get(kClazz, null) { parametersOf(objCClass::class.simpleName) }
}
