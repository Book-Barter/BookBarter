//
//  BookBarterApp.swift
//  ios
//
//  Created by Mustafa Ozhan on 24/09/2020.
//  Copyright © 2020 orgName. All rights reserved.
//

import SwiftUI
import ui

@main
struct BookBarterApp: App {
    @Environment(\.koin) var koin: Koin

    var body: some Scene {
        WindowGroup {
            MainView(
                mainViewModel: koin.getMainViewModel(),
                kermit: koin.getKermit()
            )
        }
    }
}
