/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.di

import com.github.mustafaozhan.bookbarter.data.di.RepositoryInjector
import com.github.mustafaozhan.bookbarter.ui.main.MainViewModel

object ViewModelInjector {
    fun mainViewModel() = MainViewModel(
        platformRepository = RepositoryInjector.platformRepository()
    )
}
