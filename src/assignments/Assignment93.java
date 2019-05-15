package assignments;

import java.util.*;

public class Assignment93 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		String str1;

		str1 = str.substring(n + 1, str.length());
		if (str1.contains(str.substring(0, n))) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
