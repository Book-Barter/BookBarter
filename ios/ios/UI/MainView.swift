import SwiftUI
import ui

struct MainView: View {
    var appViewModel = DependencyContainer().appViewModel()

    var body: some View {
        Text(appViewModel.getPlatformName())
    }
}

struct MainView_Previews: PreviewProvider {
    static var previews: some View {
        MainView()
    }
}
