/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.presentation

import com.github.mustafaozhan.bookbarter.common.base.BaseViewModel
import com.github.mustafaozhan.bookbarter.common.domain.app.AppUseCase

class AppViewModel(
    private val appUseCase: AppUseCase
) : BaseViewModel() {
    fun getPlatformName() = appUseCase.getPlatformName().toString()
}
