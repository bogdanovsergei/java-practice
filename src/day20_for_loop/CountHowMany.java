package day20_for_loop;

public class CountHowMany {
	public static void main(String[] args) {
		//word
		//how many characters appears at this word
		//char to count the number of occurrences
		
		String word = "computer programming";
		char myChar = 'o';
		
		int counter = 0;
		
		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i) == myChar) {
				counter++;
			}
		}
		System.out.println("Count: " + counter);
		
		
		
	}

}
