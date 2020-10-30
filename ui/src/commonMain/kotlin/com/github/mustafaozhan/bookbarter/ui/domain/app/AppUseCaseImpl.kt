/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.ui.domain.app

import com.github.mustafaozhan.bookbarter.ui.data.entity.toDomain
import com.github.mustafaozhan.bookbarter.ui.data.repository.PlatformRepository

class AppUseCaseImpl(
    private val platformRepository: PlatformRepository
) : AppUseCase {
    override fun getPlatformName() = platformRepository.platform.toDomain()

}
