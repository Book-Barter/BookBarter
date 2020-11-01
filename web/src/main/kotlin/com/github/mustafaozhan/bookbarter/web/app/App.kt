/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.web.app

import com.github.mustafaozhan.bookbarter.ui.di.initKoin
import com.github.mustafaozhan.bookbarter.web.ui.MainView
import kotlinx.browser.document
import org.koin.core.KoinApplication
import react.child
import react.createContext
import react.dom.render

private const val ROOT_ID = "root"
val AppDependenciesContext = createContext<KoinApplication>()

fun main() {
    render(document.getElementById(ROOT_ID)) {
        AppDependenciesContext.Provider(initKoin()) {
            child(MainView)
        }
    }
}
