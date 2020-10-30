/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.main

import com.github.mustafaozhan.bookbarter.data.repository.PlatformRepository
import com.github.mustafaozhan.bookbarter.ui.base.BaseViewModel

class MainViewModel(
    private val platformRepository: PlatformRepository
) : BaseViewModel() {
    fun getPlatformName() = platformRepository.platform.toString()
}
