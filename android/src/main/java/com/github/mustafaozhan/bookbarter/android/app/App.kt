/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.android.app

import android.app.Application
import android.content.Context
import com.github.mustafaozhan.bookbarter.client.constant.PLATFORM_SETTINGS_NAME
import com.github.mustafaozhan.bookbarter.client.di.initAndroid

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initAndroid(getSharedPreferences(PLATFORM_SETTINGS_NAME, Context.MODE_PRIVATE))
    }
}
