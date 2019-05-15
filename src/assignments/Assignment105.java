package assignments;

import java.util.*;

public class Assignment105 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1) {
				words[i] = words[i].substring(0, 1) + words[i].substring(words[i].length() - 1, words[i].length());
			} else {
				words[i] = words[i].substring(0, 1) + words[i].substring(words[i].length() - 1, words[i].length())
						+ ", ";
			}
		}
		System.out.print("[");
		for (String word : words) {
			System.out.print(word);
		}
		System.out.print("]");
	}

}
