/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.client.repo

import com.russhwolf.settings.Settings

class SettingsRepository(private val settings: Settings) {
    companion object {
        const val SETTINGS_NAME = "BOOKBARTER_SETTINGS"
    }
}
