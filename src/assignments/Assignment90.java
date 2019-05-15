package assignments;

import java.util.*;

public class Assignment90 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int i = 0;
		int count = 0;
		while (word.indexOf("java", i) > -1) {
			i = word.indexOf("java",i)+1;
			count++;
		}
		System.out.println(count);
	}
}
