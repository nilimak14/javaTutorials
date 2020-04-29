
public class Test11Iterable {

	public static void main(String[] args) {

		Test11UrlLibrary urlLibrary = new Test11UrlLibrary();
		//This prints URLs
	//	for(String url:urlLibrary) {
		//	System.out.println(url);
	//	}
		
		// This prints  actual html of these  Urls
		for(String html:urlLibrary) {
			System.out.println(html.length());
			System.out.println(html);
		}

	}

}
