import SwiftUI
import common

struct ContentView: View {
    var body: some View {
        Text(Platform().name)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
