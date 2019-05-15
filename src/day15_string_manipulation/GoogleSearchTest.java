package day15_string_manipulation;

public class GoogleSearchTest {
	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item + " - Google Search";
		
		if (pageTitle.startsWith(item)) {
			System.out.println("Page title check passed");
		} else {
			System.out.println("FAIL: Page title check failed");
		}
		
		if (pageTitle.endsWith("Google Search")) {
			System.out.println("PASS: Google Search is in title");
		} else {
			System.out.println(("FAIL: Google search is not in title"));
		}
	}

}
