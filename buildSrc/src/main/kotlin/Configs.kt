@file:Suppress("SpellCheckingInspection")

object Versions {
    const val kotlinVersion = "1.4.10"
    const val androidPluginVersion = "4.2.0-alpha13"
    const val androidMaterialVersion = "1.2.0"
    const val constraintLayoutVersion = "1.1.3"
    const val jUnitVersion = "4.13"
    const val ktorVersion = "1.4.0"
    const val logBackVersion = "1.2.3"
}

object Dependencies {
    object Common {
        const val testCommon = "test-common"
        const val testAnnotationsCommon = "test-annotations-common"
    }

    object Android {
        const val androidMaterial =
            "com.google.android.material:material:${Versions.androidMaterialVersion}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    }

    object Backend {
        const val ktorCore = "io.ktor:ktor-server-core:${Versions.ktorVersion}"
        const val ktorNetty = "io.ktor:ktor-server-netty:${Versions.ktorVersion}"
        const val ktorWebSockets = "io.ktor:ktor-websockets:${Versions.ktorVersion}"
        const val ktorSerialization = "io.ktor:ktor-serialization:${Versions.ktorVersion}"
        const val logBack = "ch.qos.logback:logback-classic:${Versions.logBackVersion}"
    }
}

object TestDependencies {
    object Common {
        const val jUnit = "junit:junit:${Versions.jUnitVersion}"
        const val testJUnit = "test-junit"
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
}