package assignments;

import java.util.*;

public class Assignment94 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();
		
		if (!html.contains("<html>")) {
			System.out.println("Invalid input!");
			System.exit(0);
		}
		
		int index = html.indexOf("id=\"");
		
		System.out.println(html.substring(index+4, html.indexOf("\"", index+4)));
	}

}
