/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.data.repository

import com.github.mustafaozhan.bookbarter.common.data.entity.PlatformEntity
import com.github.mustafaozhan.bookbarter.common.platformName
import com.github.mustafaozhan.bookbarter.common.platformVersion

class PlatformRepository {
    val platform = PlatformEntity(
        platformName,
        platformVersion
    )
}
