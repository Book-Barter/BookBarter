/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

@file:Suppress("SpellCheckingInspection")

object Versions {
    const val kotlin = "1.4.10"
    const val androidPlugin = "4.2.0-alpha13"
    const val androidMaterial = "1.3.0-alpha03"
    const val constraintLayout = "2.0.2"
    const val jUnit = "4.13.1"
    const val ktor = "1.4.1"
    const val logBack = "1.3.0-alpha5"
    const val kotlinXHtml = "0.7.2"
    const val versionChecker = "0.33.0"
    const val react = "16.13.1-pre.110"
}

object Dependencies {
    object Common {
        const val stdLib = "stdlib-common"
        const val test = "test-common"
        const val testAnnotations = "test-annotations-common"
    }

    object Android {
        const val androidMaterial =
            "com.google.android.material:material:${Versions.androidMaterial}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

        const val jUnit = "junit:junit:${Versions.jUnit}"
    }

    object IOS

    object JVM {
        const val stdLib = "stdlib-jdk8"
        const val test = "test"
        const val testJUnit = "test-junit"

        const val ktorCore = "io.ktor:ktor-server-core:${Versions.ktor}"
        const val ktorNetty = "io.ktor:ktor-server-netty:${Versions.ktor}"
        const val ktorWebSockets = "io.ktor:ktor-websockets:${Versions.ktor}"
        const val ktorSerialization = "io.ktor:ktor-serialization:${Versions.ktor}"
        const val logBack = "ch.qos.logback:logback-classic:${Versions.logBack}"
    }

    object JS {
        const val stdLib = "stdlib-js"
        const val test = "test-js"

        const val kotlinXHtml = "org.jetbrains.kotlinx:kotlinx-html-js:${Versions.kotlinXHtml}"
        const val kotlinReact =
            "org.jetbrains:kotlin-react:${Versions.react}-kotlin-${Versions.kotlin}"
        const val kotlinReactDom =
            "org.jetbrains:kotlin-react-dom:${Versions.react}-kotlin-${Versions.kotlin}"
    }
}

object ClassPaths {
    const val androidBuildTools = "com.android.tools.build:gradle:${Versions.androidPlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
}

object Modules {
    const val common = ":common"
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val application = "application"
    const val android = "android"
    const val androidLibrary = "com.android.library"
    const val multiplatform = "multiplatform"
    const val platformJvm = "jvm"
    const val serializationPlugin = "plugin.serialization"
    const val js = "js"
    const val versionChecker = "com.github.ben-manes.versions"
}
