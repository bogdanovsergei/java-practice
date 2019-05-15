package assignments;

import java.util.*;

public class Assignment195 {
	public static void main(String[] args) {
		boolean b = isAnagram("aqsd", "szda");
		System.out.println(b);
	}

	public static boolean isAnagram(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		ArrayList<Character> wordArr1 = new ArrayList<>();
		ArrayList<Character> wordArr2 = new ArrayList<>();
		
		for (int i=0; i<word1.length(); i++) {
			wordArr1.add(word1.charAt(i));
			wordArr2.add(word2.charAt(i));
		}
		
		for(int i=0; i<wordArr1.size(); i++) {
			for (int j=0; j< wordArr2.size(); j++) {
				if(wordArr1.get(i) == wordArr2.get(j)) {
					wordArr1.remove(i);
					wordArr2.remove(j);
					i -= 1;
					break;
					//j -= 1;
				}
			}
		}
		
		if (wordArr1.isEmpty() && wordArr2.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
