@file:Suppress("SpellCheckingInspection")

object Versions {
    const val kotlinVersion = "1.4.0"
    const val androidPluginVersion = "4.2.0-alpha02"
    const val androidMaterialVersion = "1.2.0"
    const val constraintLayoutVersion = "1.1.3"
}

object Dependencies {
    const val androidMaterial =
        "com.google.android.material:material:${Versions.androidMaterialVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
}

object TestDependencies

object Annotations

object ClassPaths {
    const val androidBuildTools = "com.android.tools.build:gradle:${Versions.androidPluginVersion}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
}

object Modules {
    const val android = ":android"
    const val common = ":common"
}

object Plugins {
    const val application = "com.android.application"
    const val android = "android"
}