import SwiftUI
import ui

struct MainView: View {
    var mainViewModel = ViewModelInjector().mainViewModel()

    var body: some View {
        Text(mainViewModel.getPlatformName())
    }
}

struct MainViewPreviews: PreviewProvider {
    static var previews: some View {
        MainView().makeForPreviewProvider()
    }
}
