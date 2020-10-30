/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.di

import com.github.mustafaozhan.bookbarter.ui.repository.PlatformRepository
import com.github.mustafaozhan.bookbarter.ui.viewmodel.AppViewModel

object ViewModelInjector {
    fun appViewModel() = AppViewModel(
        platformRepository = RepositoryInjector.platformRepository()
    )
}

object RepositoryInjector {
    fun platformRepository() = PlatformRepository()
}
