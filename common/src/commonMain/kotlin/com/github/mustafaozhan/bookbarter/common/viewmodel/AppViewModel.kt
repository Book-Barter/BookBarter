/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.viewmodel

import com.github.mustafaozhan.bookbarter.common.base.BaseViewModel
import com.github.mustafaozhan.bookbarter.common.repository.PlatformRepository

class AppViewModel : BaseViewModel() {
    private val platformRepository = PlatformRepository()

    fun getPlatformName() = platformRepository.name
}
