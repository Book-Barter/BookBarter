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
    implementation(project(Modules.common))

    with(Dependencies.Android) {
        implementation(androidMaterial)
        implementation(constraintLayout)
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