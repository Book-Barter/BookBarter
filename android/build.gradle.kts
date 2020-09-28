plugins {
    with(Plugins) {
        id(application)
        kotlin(android)
    }
}
group = ProjectSettings.projectId
version = ProjectSettings.getVersionName(project)

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
dependencies {
    implementation(project(Modules.common))

    with(Dependencies) {
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