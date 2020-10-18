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
    implementation(project(Modules.common))
}

kotlin {
    js {
        useCommonJs()
        browser()
    }
}
