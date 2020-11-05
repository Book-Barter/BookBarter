/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.web.ui

import com.github.mustafaozhan.bookbarter.ui.di.getForJs
import com.github.mustafaozhan.bookbarter.ui.main.MainViewModel
import com.github.mustafaozhan.bookbarter.web.app.AppDependenciesContext
import react.RProps
import react.child
import react.dom.h1
import react.dom.tr
import react.functionalComponent
import react.useContext

private val mainViewModel: MainViewModel by lazy {
    useContext(AppDependenciesContext).koin.getForJs(MainViewModel::class)
}

val MainView = functionalComponent<RProps> {

    child(
        functionalComponent {
            h1 { +"Book Barters" }
            tr { +mainViewModel.getPlatformName() }
        }
    )
}
