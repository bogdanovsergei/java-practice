package assignments;

import java.util.*;

public class Assignment95 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		int i = 0;
		while (str.indexOf("bread", i) > -1) {
			i = str.indexOf("bread",i)+1;
		}
		
		if (str.indexOf("bread") > -1) {
			if (str.indexOf("bread", str.indexOf("bread") + 5) > -1) {
				System.out.println(str.substring(str.indexOf("bread")+5, i-1));
			} else {
				System.out.println("nothing");
			}
		} else {
		  System.out.println("nothing");
		}
		

	}

}
