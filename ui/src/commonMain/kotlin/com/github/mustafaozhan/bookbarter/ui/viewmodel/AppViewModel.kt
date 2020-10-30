/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.viewmodel

import com.github.mustafaozhan.bookbarter.data.repository.PlatformRepository
import com.github.mustafaozhan.bookbarter.ui.base.BaseViewModel

class AppViewModel(
    private val platformRepository: PlatformRepository
) : BaseViewModel() {
    fun getPlatformName() = platformRepository.platform.toString()
}
