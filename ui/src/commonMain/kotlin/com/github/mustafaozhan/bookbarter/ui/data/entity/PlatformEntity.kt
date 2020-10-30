/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.data.entity

import com.github.mustafaozhan.bookbarter.ui.domain.model.Platform

data class PlatformEntity(
    val name: String,
    val version: String
)

internal fun PlatformEntity.toDomain() = Platform(
    name = "$name $version"
)
