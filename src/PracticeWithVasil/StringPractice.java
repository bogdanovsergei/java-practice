package PracticeWithVasil;

public class StringPractice {
	public static void main(String[] args) {
		String word = "java";				// located in String pool
		String word2 = new String("java"); 	// located in in Java heap
		System.out.println(word==word2);	//check are the objects the same (location in the memory)
		System.out.println(word.equals(word2)); //equals method checks the value
		
	}

}
