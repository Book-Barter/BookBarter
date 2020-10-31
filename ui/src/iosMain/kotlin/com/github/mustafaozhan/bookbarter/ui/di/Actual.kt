/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.di

import com.github.mustafaozhan.bookbarter.ui.main.MainViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module = module {
    single { MainViewModel(get()) }
}
