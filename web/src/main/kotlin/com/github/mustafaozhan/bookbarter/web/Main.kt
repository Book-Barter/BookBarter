package com.github.mustafaozhan.bookbarter.web

import com.github.mustafaozhan.bookbarter.common.Greeting
import kotlinx.browser.document
import react.child
import react.dom.h1
import react.dom.render
import react.dom.tr
import react.functionalComponent


private const val rootId = "root"

fun main() = render(
    document.getElementById(rootId)
) {
    child(
        functionalComponent {
            h1 {
                +"Book Barters"
            }
            tr { +greet() }
        }
    )
}

fun greet(): String {
    return Greeting().greeting()
}
