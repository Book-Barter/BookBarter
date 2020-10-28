/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

plugins {
    id(Plugins.versionChecker) version Versions.versionChecker
}

buildscript {
    repositories {
        gradlePluginPortal()
        google()
    }
    dependencies {
        with(ClassPaths) {
            classpath(kotlinGradlePlugin)
            classpath(androidBuildTools)
            classpath(kotlinSerialization)
        }
    }
}

group = ProjectSettings.projectId
version = ProjectSettings.getVersionName(project)

allprojects {
    repositories {
        mavenCentral()
        jcenter()
    }
}
