import SwiftUI
import common

struct ContentView: View {
    var appViewModel = AppViewModel()
    var body: some View {
        Text(appViewModel.getPlatformName())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
