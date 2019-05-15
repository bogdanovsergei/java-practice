package day20_for_loop;

public class PrintEachChar {
	public static void main(String[] args) {
		String word = "Wooden Spoon";
		//using for loop print each char one by one
		
		for(int i=0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		// print only vowel
		for (int j=0; j<word.length(); j++) {
			char letter = word.toLowerCase().charAt(j);
			if (	letter == 'a' ||
					letter == 'e' ||
					letter == 'o' ||
					letter == 'i' ||
					letter == 'u') {
			System.out.print(letter + ", ");
			}
		}
		
		System.out.println();
		for (int j=0; j<word.length(); j++) {
			char letter = word.toLowerCase().charAt(j);
			if (	!(letter == 'a' ||
					letter == 'e' ||
					letter == 'o' ||
					letter == 'i' ||
					letter == 'u')) {
			System.out.print(letter + ", ");
			}
		}
	}

}
