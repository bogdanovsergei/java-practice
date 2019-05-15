package day20_for_loop;

import java.util.*;

public class Neighbors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();
		//aabcdd
		//beeep - a
		//beeep - d
		
		for(int i=0; i<word.length()-1; i++) {
			if (word.charAt(i) == word.charAt(i+1)) {
				System.out.println("Beeep - " + word.charAt(i));
			}
		}
	}

}