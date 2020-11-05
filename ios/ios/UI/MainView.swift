import SwiftUI
import ui

struct MainView: View {
    var mainViewModel: MainViewModel

    var body: some View {
        Text(mainViewModel.getPlatformName())
    }
}

struct MainViewPreviews: PreviewProvider {
    @Environment(\.koin) static var koin: Koin

    static var previews: some View {
        MainView(mainViewModel: koin.getMainViewModel())
            .makeForPreviewProvider()
    }
}
