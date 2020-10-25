/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.viewmodel

import com.github.mustafaozhan.bookbarter.common.base.BaseViewModel
import com.github.mustafaozhan.bookbarter.common.repository.PlatformRepository

class AppViewModel(
    private val platformRepository: PlatformRepository
) : BaseViewModel() {
    fun getPlatformName() = platformRepository.name
}
