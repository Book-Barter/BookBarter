/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data

import com.github.mustafaozhan.bookbarter.data.di.RepositoryInjector
import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformRepositoryTest {
    private val platformRepository = RepositoryInjector.platformRepository()

    @Test
    fun testExample() {
        assertTrue(
            platformRepository.platform.name.contains("iOS"),
            "Check iOS is mentioned"
        )
    }
}
