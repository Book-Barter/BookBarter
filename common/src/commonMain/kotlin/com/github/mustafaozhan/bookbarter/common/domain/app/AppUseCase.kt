/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.domain.app

import com.github.mustafaozhan.bookbarter.common.domain.model.Platform

interface AppUseCase {
    fun getPlatformName(): Platform
}
