package day21_loops_practice;

import java.util.*;

public class UniqueCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter word:");
		String word = scan.next();
		String unique = "";
		
		for (int i=0; i<word.length(); i++) {				// using contains
			if (!unique.contains("" + word.charAt(i))) {
				unique += word.charAt(i);
			}
		}
		System.out.println("Unique: " + unique);
		
		unique = "";
		for (int i=0; i<word.length(); i++) {				// using indexOf
			if (unique.indexOf(word.charAt(i)) == -1) {
				unique += word.charAt(i);
			}
		}
		System.out.println("Unique: " + unique);
		
		
		int k = 0;
		int j=0;
		for (int i=0; i<word.length(); i++) {
			for ( j=0; j<word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					k = j;
				}
			}
			if (i == k) {
				System.out.print(word.charAt(i));
			}
		}
			
		
	}

}