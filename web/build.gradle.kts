plugins {
    with(Plugins) {
        kotlin(js)
        kotlin(serializationPlugin)
    }
}

dependencies {
    with(Dependencies.Web) {
        implementation(kotlinXHtml)

        implementation(kotlinReact)
        implementation(kotlinReactDom)
        implementation(npm(react, Versions.npmReactVersion))
        implementation(npm(reactDom, Versions.npmReactVersion))
    }
    implementation(project(Modules.common))
}

kotlin {
    js {
        useCommonJs()
        browser()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}