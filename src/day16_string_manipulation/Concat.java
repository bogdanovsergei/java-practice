package day16_string_manipulation;

public class Concat {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		word = word.concat("+Eclipse");
		System.out.println(word);
		word = word.concat(" Automation");
		System.out.println(word);
		
		//word = word.concat(123);  will not wirk
		word = word + 123;
		System.out.println(word);
		
		word = word + true;
		System.out.println(word);
		
		String word2 = "Hi";
		word2 = word2.concat("\n-hey\n").concat("-how are you\n").concat("-good");
		System.out.println(word2);
	}

}
