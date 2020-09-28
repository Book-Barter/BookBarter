object Versions {
    const val kotlinVersion = "1.4.0"
    const val androidPluginVersion = "4.0.1"
}

object Dependencies

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

object Plugins