/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

@file:Suppress("SpellCheckingInspection")

object Versions {
    const val kotlinVersion = "1.4.10"
    const val androidPluginVersion = "4.2.0-alpha13"
    const val androidMaterialVersion = "1.2.0"
    const val constraintLayoutVersion = "1.1.3"
    const val jUnitVersion = "4.13"
    const val ktorVersion = "1.4.0"
    const val logBackVersion = "1.2.3"
    const val kotlinXHtmlVersion = "0.7.2"
}

object Dependencies {
    object Common {
        const val stdLib = "stdlib-common"
        const val test = "test-common"
        const val testAnnotations = "test-annotations-common"
    }

    object Android {
        const val androidMaterial =
            "com.google.android.material:material:${Versions.androidMaterialVersion}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"

        const val jUnit = "junit:junit:${Versions.jUnitVersion}"
    }

    object IOS

    object JVM {
        const val stdLib = "stdlib-jdk8"
        const val test = "test"
        const val testJUnit = "test-junit"

        const val ktorCore = "io.ktor:ktor-server-core:${Versions.ktorVersion}"
        const val ktorNetty = "io.ktor:ktor-server-netty:${Versions.ktorVersion}"
        const val ktorWebSockets = "io.ktor:ktor-websockets:${Versions.ktorVersion}"
        const val ktorSerialization = "io.ktor:ktor-serialization:${Versions.ktorVersion}"
        const val logBack = "ch.qos.logback:logback-classic:${Versions.logBackVersion}"
    }

    object JS {
        const val stdLib = "stdlib-js"
        const val test = "test-js"

        const val kotlinXHtml =
            "org.jetbrains.kotlinx:kotlinx-html-js:${Versions.kotlinXHtmlVersion}"
        const val kotlinReact =
            "org.jetbrains:kotlin-react:16.13.1-pre.110-kotlin-${Versions.kotlinVersion}"
        const val kotlinReactDom =
            "org.jetbrains:kotlin-react-dom:16.13.1-pre.110-kotlin-${Versions.kotlinVersion}"
    }
}

object ClassPaths {
    const val androidBuildTools = "com.android.tools.build:gradle:${Versions.androidPluginVersion}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val kotlinSerialization =
        "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlinVersion}"
}

object Modules {
    const val android = ":android"
    const val common = ":common"
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val application = "application"
    const val android = "android"
    const val androidLibrary = "com.android.library"
    const val multiplatform = "multiplatform"
    const val platformJvm = "kotlin-platform-jvm"
    const val serializationPlugin = "plugin.serialization"
    const val js = "js"
}
