import SwiftUI
import shared

import WebKit

struct WebView: UIViewRepresentable {
    //var url: URL = URL(string: Greeting().getUrl())
    var url: URL
    
    func makeUIView(context: Context) -> WKWebView {
        return WKWebView()
    }
    func updateUIView(_ webView: WKWebView, context: Context) {
        let request = URLRequest(url: url)
        webView.load(request)
    }
}

struct ContentView: View {
	let greet = Greeting()

	var body: some View {
        VStack(spacing: 15) {
            Text(greet.greeting())
            
            WebView(url: URL(string: greet.getUrl())!)
                .frame(width: 400, height: 500)
                //.clipShape(Circle()) //圓形外框
        }
	}
}

struct ContentView_Previews: PreviewProvider {
       
	static var previews: some View {
        ContentView()
	}
}
