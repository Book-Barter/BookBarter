buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        with(ClassPaths) {
            classpath(kotlinGradlePlugin)
            classpath(androidBuildTools)
        }
    }
}
group = ProjectSettings.projectId
version = ProjectSettings.getVersionName(project)

repositories {
    mavenCentral()
}
