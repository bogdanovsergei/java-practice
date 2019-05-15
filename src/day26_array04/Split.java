package day26_array04;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		String[] wordsArray = words.split(",");
		System.out.println("count: " + wordsArray.length);
		System.out.println(Arrays.toString(wordsArray));
		
		for (String word: wordsArray) {
			System.out.println(word);
		}
		System.out.println();
		
		// take 1,461
		String diceResult = "1 - 20 of 1,461 positions";
		String[] diceArray = diceResult.split(" ");
		System.out.println(diceArray[4]);
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] ISplit = sentence.split("I");
		System.out.println(Arrays.toString(allWords));
		System.out.println(Arrays.toString(happySplit));
		System.out.println(Arrays.toString(ISplit));
		
		String word = "java";
		char [] chars = word.toCharArray();
		System.out.println(Arrays.toString(chars));
	}

}
