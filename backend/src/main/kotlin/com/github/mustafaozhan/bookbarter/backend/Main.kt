package com.github.mustafaozhan.bookbarter.backend

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
private const val port = 8080
private const val host = "127.0.0.1"

// Paths
private const val pathRoot = "/"

// Resources
private const val indexHtml = "index.html"

fun main() {
    embeddedServer(
        Netty,
        port = port,
        host = host
    ) {

        install(ContentNegotiation) {
            json()
        }

        routing {
            get(pathRoot) {
                this::class.java.classLoader.getResource(indexHtml)?.readText()?.let {
                    call.respondText(it, ContentType.Text.Html)
                }
            }
        }

    }.start(wait = true)
}