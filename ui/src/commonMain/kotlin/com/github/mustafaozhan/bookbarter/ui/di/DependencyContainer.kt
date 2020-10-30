/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.di

import com.github.mustafaozhan.bookbarter.ui.data.repository.PlatformRepository
import com.github.mustafaozhan.bookbarter.ui.domain.app.AppUseCase
import com.github.mustafaozhan.bookbarter.ui.domain.app.AppUseCaseImpl
import com.github.mustafaozhan.bookbarter.ui.presentation.AppViewModel
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.direct
import org.kodein.di.instance
import org.kodein.di.provider
import kotlin.native.concurrent.ThreadLocal

@ThreadLocal
object DependencyContainer {
    private val injector = DI.lazy {
        presentationModule()
        domainModule()
        dataModule()
    }

    // Presentation
    private fun DI.MainBuilder.presentationModule() {
        bind<AppViewModel>() with provider { AppViewModel(instance()) }
    }

    // Domain
    private fun DI.MainBuilder.domainModule() {
        bind<AppUseCase>() with provider { AppUseCaseImpl(instance()) }
    }

    // Data
    private fun DI.MainBuilder.dataModule() {
        bind<PlatformRepository>() with provider { PlatformRepository() }
    }

    fun appViewModel() = injector.direct.instance<AppViewModel>()
}
