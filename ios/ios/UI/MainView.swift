import SwiftUI
import client

struct MainView: View {
    var mainViewModel: MainViewModel
    var kermit: Kermit

    init(mainViewModel: MainViewModel, kermit: Kermit) {
        self.mainViewModel = mainViewModel
        self.kermit = kermit
        kermit.d(withMessage: {"MainView"})
    }

    var body: some View {
        Text(mainViewModel.getPlatformName())
    }
}

struct MainViewPreviews: PreviewProvider {
    @Environment(\.koin) static var koin: Koin

    static var previews: some View {
        MainView(
            mainViewModel: koin.getMainViewModel(),
            kermit: koin.getKermit()
        ).makeForPreviewProvider()
    }
}
