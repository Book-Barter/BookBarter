/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data.di

import com.github.mustafaozhan.bookbarter.data.repository.PlatformRepository
import org.koin.core.module.Module
import org.koin.dsl.module

var dataModule: Module = module {
    single { PlatformRepository() }
}
