/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data.repository

import com.github.mustafaozhan.bookbarter.ui.model.Platform
import com.github.mustafaozhan.bookbarter.ui.platformName
import com.github.mustafaozhan.bookbarter.ui.platformVersion

class PlatformRepository {
    val platform = Platform(
        platformName,
        platformVersion
    )
}
