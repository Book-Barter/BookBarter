/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */
enableFeaturePreview("GRADLE_METADATA")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android" || requested.id.name == "kotlin-android-extensions") {
                useModule("com.android.tools.build:gradle:4.0.1")
            }
        }
    }
}
rootProject.name = "BookBarter"

include(
    ":android",
    ":ui",
    ":data",
    ":backend",
    ":web"
)
