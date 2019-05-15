package assignments;

import java.util.*;

public class Assignment187 {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi", "yo", "hi", "hi"));
		System.out.println(removeAll(wordList, "hi"));
	}

	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList<String> combine = new ArrayList<>();

		for (String word1 : wordList1) {
			combine.add(word1);
		}

		for (String word2 : wordList2) {
			combine.add(word2);
		}

		return combine;
	}

	// Assignment 188

	public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord) {
		int count = 0;
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).equals(targetWord)) {
				count++;
			}
		}

		for (int j = 0; j < count; j++) {
			wordList.remove(targetWord);
		}
		return wordList;
	}

}
