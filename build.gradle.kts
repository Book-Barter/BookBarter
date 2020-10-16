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

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}