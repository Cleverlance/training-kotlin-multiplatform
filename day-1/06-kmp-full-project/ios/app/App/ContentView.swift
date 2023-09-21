import SwiftUI
import Multiplatform

struct ContentView: View {
    var body: some View {
        Text(HelloKt.hello(name: PlatformKt.platform))
    }
}

#Preview {
    ContentView()
}