package day40_customclasses;
import java.util.*;
public class WarmUpList {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("word");
		arr.add("word");
		arr.add("word");
		arr.add("asd");
		System.out.println(CountOccurances(arr, "word"));
	}
	
	public static int CountOccurances(ArrayList<String> arr, String word) {
		int count = 0;
		
		for (int i=0; i<arr.size(); i++) {
			if (word.equalsIgnoreCase(arr.get(i))) {
				count++;
			}
		}
		return count;
	}

}
