/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.client.main

import com.github.mustafaozhan.bookbarter.client.base.BaseViewModel
import com.github.mustafaozhan.bookbarter.common.di.kermit
import com.github.mustafaozhan.bookbarter.common.repository.PlatformRepository

class MainViewModel(
    private val platformRepository: PlatformRepository
) : BaseViewModel() {
    init {
        kermit.d { "MainViewModel" }
    }

    fun getPlatformName() = platformRepository.platform.toString()
}
