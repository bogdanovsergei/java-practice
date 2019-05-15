package day19;

import java.util.*;

public class Palindrom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test");
		String word = scan.next().toLowerCase();
		String reversed = "";
		
		/*int indx = 0;						//my version
		while (indx < word.length()) {
			if (word.charAt(indx) != word.charAt(word.length()-1-indx)) {
				System.out.println("Not palindrom");
				System.exit(0);
			}
			indx++;
		}
		System.out.println("Palindrom");
		*/
		
		int idx = word.length()-1;
		while (idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
		}
		System.out.println(reversed);
		
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrom");
		} else {
			System.out.println("It is not palindrom");
		}

	}

}
