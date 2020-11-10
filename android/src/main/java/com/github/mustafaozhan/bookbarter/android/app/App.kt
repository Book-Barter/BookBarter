/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.android.app

import android.app.Application
import android.content.Context
import com.github.mustafaozhan.bookbarter.client.di.initAndroid
import com.github.mustafaozhan.bookbarter.client.repo.SettingsRepository.Companion.SETTINGS_NAME

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initAndroid(getSharedPreferences(SETTINGS_NAME, Context.MODE_PRIVATE))
    }
}
