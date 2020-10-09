plugins {
    id(Plugins.platformJvm)
    id("org.gradle.application")
}

dependencies {
    implementation(project(Modules.common))
}
