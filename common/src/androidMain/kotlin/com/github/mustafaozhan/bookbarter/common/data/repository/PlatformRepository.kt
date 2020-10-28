/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common.data.repository

actual class PlatformRepository {
    actual val name = "Android ${android.os.Build.VERSION.SDK_INT}"
}
