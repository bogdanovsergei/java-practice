package day14_string_method;

public class ChaAt {
	public static void main(String[] args) {
		String word = "Com puter";
		
		// print all characters one by one
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		System.out.println(word.charAt(8));
		
		//String word2 and check if first character is 'J'
		
		String word2="java";
		if (word2.toUpperCase().charAt(0) == 'J') {
			System.out.println("The first character is 'J'");
		} else {
			System.out.println("The first character is not 'J'");
		}
		
		//word3 consist of 5 characters
		//check the first and the last are the same
		
		String word3 = "civic"; // - is palindrom
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		if (first == last) {
			System.out.println("First and last mathes");
		} else {
			System.out.println("First and last not matches");
		}
		
		// word4 ==> always print the last char
		//no matter the length
		String word4 = "asdasdasdasf123qweqweqweqdsdasdqwhsfkihuytvrvytgr";
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last value of word4 is " + lastChar);
	}

}
