package day31_methods03;
import java.util.*;
public class countWords {
	public static void main(String[] args) {
		countWords("Java is fun");
		googleSearchResults("About 26,500,000 results (0.68 seconds)");
	}
	
	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		System.out.println("Number of words: " + words.length);
	}
	
	//About 26,500,000 results (0.68 seconds) 
	public static void googleSearchResults(String result) {
		String[] words = result.split(" ");
		words[1] = words[1].replace(",", "");
		System.out.println("Results count: " + words[1]);
		words[3] = words[3].substring(1, words[3].length());
		System.out.println("Time in seconds: " + words[3]);
	}
}
