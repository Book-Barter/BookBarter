/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.domain.app

import com.github.mustafaozhan.bookbarter.ui.domain.model.Platform

interface AppUseCase {
    fun getPlatformName(): Platform
}
