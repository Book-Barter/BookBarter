/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.web.ui

import com.github.mustafaozhan.bookbarter.ui.di.getJs
import com.github.mustafaozhan.bookbarter.ui.main.MainViewModel
import com.github.mustafaozhan.bookbarter.web.app.AppDependenciesContext
import react.RProps
import react.child
import react.dom.h1
import react.dom.tr
import react.functionalComponent
import react.useContext

lateinit var mainViewModel: MainViewModel

val MainView = functionalComponent<RProps> {

    val appDependencies = useContext(AppDependenciesContext)

    mainViewModel = appDependencies.koin.getJs(MainViewModel::class)

    child(
        functionalComponent {
            h1 { +"Book Barters" }
            tr { +mainViewModel.getPlatformName() }
        }
    )
}
