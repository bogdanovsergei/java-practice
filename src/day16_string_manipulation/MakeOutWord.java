package day16_string_manipulation;

public class MakeOutWord {
	public static void main(String[] args) {
		String chars = "<<>>";
		String word = "java";
		
		String result = chars.substring(0,2) + word + chars.substring(2,4);
		System.out.println(result);
	}

}
