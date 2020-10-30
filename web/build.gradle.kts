/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

plugins {
    with(Plugins) {
        kotlin(js)
        kotlin(serializationPlugin)
    }
}

dependencies {
    with(Dependencies.JS) {
        implementation(kotlinXHtml)

        implementation(kotlinReact)
        implementation(kotlinReactDom)
    }
    implementation(project(Modules.ui))
}

kotlin {
    // todo need to revert when Kodein supports IR
    // https://github.com/Kodein-Framework/Kodein-DI/issues/339
    js {
        useCommonJs()
        browser {
            binaries.executable()
        }
    }
}
