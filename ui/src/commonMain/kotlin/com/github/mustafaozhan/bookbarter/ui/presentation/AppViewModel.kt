/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.presentation

import com.github.mustafaozhan.bookbarter.ui.base.BaseViewModel
import com.github.mustafaozhan.bookbarter.ui.domain.app.AppUseCase

class AppViewModel(
    private val appUseCase: AppUseCase
) : BaseViewModel() {
    fun getPlatformName() = appUseCase.getPlatformName().toString()
}
