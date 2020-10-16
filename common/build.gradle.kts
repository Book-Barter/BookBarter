import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    with(Plugins) {
        kotlin(multiplatform)
        id(androidLibrary)
    }
}

group = ProjectSettings.projectId
version = ProjectSettings.getVersionName(project)

repositories {
    gradlePluginPortal()
    google()
}

kotlin {

    jvm()

    android()

    ios {
        binaries {
            framework {
                baseName = "common"
            }
        }
    }

    js {
        browser {
            testTask {
                enabled = false
            }
        }
    }

    @Suppress("UNUSED_VARIABLE")
    sourceSets {

        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin(Dependencies.Common.testCommon))
                implementation(kotlin(Dependencies.Common.testAnnotationsCommon))
            }
        }

        val jvmMain by getting
        val jvmTest by getting {
            dependencies {
                implementation(TestDependencies.Common.jUnit)
            }
        }

        val jsMain by getting
        val jsTest by getting

        val androidMain by getting {
            dependencies {
                implementation(Dependencies.Android.androidMaterial)
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(TestDependencies.Common.jUnit)
            }
        }
        val iosMain by getting
        val iosTest by getting
    }
}

android {
    with(ProjectSettings) {
        compileSdkVersion(projectTargetSdkVersion)

        defaultConfig {
            minSdkVersion(projectMinSdkVersion)
            targetSdkVersion(projectTargetSdkVersion)
            versionCode = getVersionCode(project)
            versionName = getVersionName(project)
        }

        sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    }
}

val packForXcode by tasks.creating(Sync::class) {
    group = "build"
    val mode = System.getenv("CONFIGURATION") ?: "DEBUG"
    val sdkName = System.getenv("SDK_NAME") ?: "iphonesimulator"
    val targetName = "ios" + if (sdkName.startsWith("iphoneos")) "Arm64" else "X64"
    val framework =
        kotlin.targets.getByName<KotlinNativeTarget>(targetName).binaries.getFramework(mode)
    inputs.property("mode", mode)
    dependsOn(framework.linkTask)
    val targetDir = File(buildDir, "xcode-frameworks")
    from({ framework.outputDirectory })
    into(targetDir)
}

tasks.getByName("build").dependsOn(packForXcode)