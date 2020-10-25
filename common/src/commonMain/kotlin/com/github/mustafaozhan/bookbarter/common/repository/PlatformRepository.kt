/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.repository

@Suppress("EmptyDefaultConstructor")
expect class PlatformRepository() {
    val name: String
}
