/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.domain.app

import com.github.mustafaozhan.bookbarter.common.data.entity.toDomain
import com.github.mustafaozhan.bookbarter.common.data.repository.PlatformRepository

class AppUseCaseImpl(
    private val platformRepository: PlatformRepository
) : AppUseCase {
    override fun getPlatformName() = platformRepository.platform.toDomain()

}
