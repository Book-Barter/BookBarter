/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data.repository

import com.github.mustafaozhan.bookbarter.data.model.Platform
import com.github.mustafaozhan.bookbarter.data.platformName
import com.github.mustafaozhan.bookbarter.data.platformVersion

class PlatformRepository {
    val platform = Platform(
        platformName,
        platformVersion
    )
}
