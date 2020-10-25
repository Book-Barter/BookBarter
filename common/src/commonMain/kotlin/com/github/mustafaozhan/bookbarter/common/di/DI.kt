/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.di

import com.github.mustafaozhan.bookbarter.common.repository.PlatformRepository
import com.github.mustafaozhan.bookbarter.common.viewmodel.AppViewModel

object ViewModelInjector {
    fun appViewModel() = AppViewModel(
        platformRepository = RepositoryInjector.platformRepository()
    )
}

object RepositoryInjector {
    fun platformRepository() = PlatformRepository()
}
