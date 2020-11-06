//
//  Koin.swift
//  ios
//
//  Created by Mustafa Ozhan on 01/11/2020.
//  Copyright © 2020 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import ui

struct Koin {
    let koin = KoinIOSKt.doInitIOS().koin
}

struct KoinKey: EnvironmentKey {
    typealias Value = Koin
    static var defaultValue = Koin()
}

extension EnvironmentValues {
    var koin: Koin {
        get {
            return self[KoinKey.self]
        }
        set {
            self[KoinKey.self] = newValue
        }
    }
}

// swiftlint:disable force_cast
extension Koin {
    func getMainViewModel() -> MainViewModel {
        return koin.getForIOS(objCClass: MainViewModel.self) as! MainViewModel
    }
    func getKermit() -> Kermit {
        return koin.getForIOS(objCClass: Kermit.self) as! Kermit
    }
}
