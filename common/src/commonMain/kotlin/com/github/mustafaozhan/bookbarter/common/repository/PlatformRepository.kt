/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.repository

@Suppress("EmptyDefaultConstructor")
internal expect class PlatformRepository() {
    val name: String
}
