/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.data.repository

@Suppress("EmptyDefaultConstructor")
expect class PlatformRepository() {
    val name: String
}
