/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data.di

import com.github.mustafaozhan.bookbarter.data.repository.PlatformRepository

object RepositoryInjector {
    fun platformRepository() = PlatformRepository()
}
