package day16_string_manipulation;
import java.util.*;
public class Url {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String url = scan.next();
		if (url.startsWith("www.")) {
			
			if (url.lastIndexOf('.') != 3 && 
				url.indexOf('.', 3) > -1 && 
				url.indexOf('.', 4) == url.lastIndexOf('.')) {
				
				switch (url.substring(url.lastIndexOf('.')+1, url.length())) {
				case "com":
				case "gov":
				case "net":
				case "org":
				case "edu":
					break;
				default:
					System.out.println("Invalid url format");
					return;
					
				}
					
				String domain = url.substring(4, url.lastIndexOf('.'));
				String extension = url.substring(url.lastIndexOf('.')+1, url.length());
				System.out.println("Domain: " + domain);
				System.out.println("Extension: " + extension);
			} else {
				System.out.println("Invalid url format");
			}
			
		} else {
			System.out.println("Invalid url format");
		}
	}

}
