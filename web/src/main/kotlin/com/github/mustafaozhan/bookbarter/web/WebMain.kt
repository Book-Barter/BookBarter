/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.web

import com.github.mustafaozhan.bookbarter.common.di.ViewModelInjector
import kotlinx.browser.document
import react.child
import react.dom.h1
import react.dom.render
import react.dom.tr
import react.functionalComponent

private const val ROOT_ID = "root"

private val appViewModel = ViewModelInjector.appViewModel()

fun main() = render(
    document.getElementById(ROOT_ID)
) {
    child(
        functionalComponent {
            h1 {
                +"Book Barters"
            }
            tr { +appViewModel.getPlatformName() }
        }
    )
}
