/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data

import platform.UIKit.UIDevice

actual val platformName = UIDevice.currentDevice.systemName()
actual val platformVersion = UIDevice.currentDevice.systemVersion
