/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

plugins {
    with(Plugins) {
        id(androidApplication)
        kotlin(android)
    }
}
group = ProjectSettings.projectId
version = ProjectSettings.getVersionName(project)

repositories {
    gradlePluginPortal()
    google()
}

dependencies {
    implementation(project(Modules.ui))

    with(Dependencies.Android) {
        implementation(androidMaterial)
        implementation(constraintLayout)

        implementation(koinAndroid)
        implementation(koinAndroidViewModel)
    }
}

android {
    with(ProjectSettings) {
        compileSdkVersion(projectCompileSdkVersion)
        defaultConfig {
            applicationId = "$projectId.android"
            minSdkVersion(projectMinSdkVersion)
            targetSdkVersion(projectTargetSdkVersion)
            versionCode = getVersionCode(project)
            versionName = getVersionName(project)
        }
    }
}
