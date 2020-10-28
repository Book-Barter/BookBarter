/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.di

import com.github.mustafaozhan.bookbarter.common.data.repository.PlatformRepository
import com.github.mustafaozhan.bookbarter.common.viewmodel.AppViewModel
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.direct
import org.kodein.di.instance
import org.kodein.di.provider
import kotlin.native.concurrent.ThreadLocal

@ThreadLocal
object DependencyContainer {
    private val injector = DI.lazy {
        viewModelModule()
        repositoryModule()
    }

    private fun DI.MainBuilder.viewModelModule() {
        bind<AppViewModel>() with provider { AppViewModel(instance()) }
    }

    private fun DI.MainBuilder.repositoryModule() {
        bind<PlatformRepository>() with provider { PlatformRepository() }
    }

    fun appViewModel() = injector.direct.instance<AppViewModel>()
}
