/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.data.repository

import com.github.mustafaozhan.bookbarter.ui.data.entity.PlatformEntity
import com.github.mustafaozhan.bookbarter.ui.platformName
import com.github.mustafaozhan.bookbarter.ui.platformVersion

class PlatformRepository {
    val platform = PlatformEntity(
        platformName,
        platformVersion
    )
}
