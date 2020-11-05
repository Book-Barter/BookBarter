/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data.di

import org.koin.core.Koin
import org.koin.core.parameter.parametersOf
import kotlin.reflect.KClass

fun <T> Koin.getForJvm(clazz: KClass<*>): T {
    return get(clazz, null) { parametersOf(clazz.simpleName) } as T
}
