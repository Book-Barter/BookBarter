/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.android.app

import android.app.Application
import com.github.mustafaozhan.bookbarter.ui.di.initKoin
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin(module {})
    }
}
