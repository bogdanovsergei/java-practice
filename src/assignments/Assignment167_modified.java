package assignments;

import java.util.*;

public class Assignment167_modified {
	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("paraaalllppela"));
		double d=2.123121413;
		System.out.printf("%.2f" , d);
	}

	public static String uniqueChars(String str) {
		List<Character> characters = new ArrayList<>();
		
		for (int i = 0; i < str.length(); i++) {
			characters.add(str.charAt(i));
		}

//		for (int i = 0; i < characters.size(); i++) {
//			for (int j = 0; j < characters.size(); j++) {
//				if (characters.get(i) == characters.get(j) && i != j) {
//					characters.remove(j);
//				}
//			}
//		}
		for (int i = 0; i < characters.size(); i++) {
			for (int j = 0; j < characters.size(); j++) {
				if (characters.get(i) == characters.get(j) && i != j) {
					characters.remove(j);
					j=j-1;
				}
			}
		}

		String result = "";
		for (char ch : characters) {
			result += ch;
		}
		return result;
	}
}
