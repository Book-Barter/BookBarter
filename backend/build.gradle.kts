/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

plugins {
    with(Plugins) {
        id(platformJvm)
        kotlin(serializationPlugin)
    }
    application
}

dependencies {
    implementation(project(Modules.common))

    with(Dependencies.Backend) {
        implementation(ktorCore)
        implementation(ktorNetty)
        implementation(ktorWebSockets)
        implementation(ktorSerialization)
        implementation(logBack)
    }
}

application {
    mainClass.set("${ProjectSettings.projectId}.backend.MainKt")
}
