/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.backend

import com.github.mustafaozhan.bookbarter.common.di.ViewModelInjector
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.serialization.json
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

// Configs
private const val PORT = 8000
private const val HOST = "127.0.0.1"

// Paths
private const val PATH_ROOT = "/"

// Resources
private const val INDEX_HTML = "index.html"

private val appViewModel = ViewModelInjector.appViewModel()

fun main() {
    embeddedServer(
        Netty,
        port = PORT,
        host = HOST
    ) {

        install(ContentNegotiation) {
            json()
        }

        routing {
            get(PATH_ROOT) {
                this::class.java.classLoader?.getResource(INDEX_HTML)
                    ?.readText()?.let {
                        call.respondText(appViewModel.getPlatformName(), ContentType.Text.Html)
                    }
            }
        }
    }.start(wait = true)
}
