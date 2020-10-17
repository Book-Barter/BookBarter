/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.common

actual class Platform {
    actual val name = "Android ${android.os.Build.VERSION.SDK_INT}"
}
