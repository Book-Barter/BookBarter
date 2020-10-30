/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data.viewmodel

import com.github.mustafaozhan.bookbarter.ui.base.BaseViewModel
import com.github.mustafaozhan.bookbarter.ui.repository.PlatformRepository

class AppViewModel(
    private val platformRepository: PlatformRepository
) : BaseViewModel() {
    fun getPlatformName() = platformRepository.platform.toString()
}
