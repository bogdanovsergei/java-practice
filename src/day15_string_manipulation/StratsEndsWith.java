package day15_string_manipulation;

public class StratsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("Ec"));
		
		System.out.println(word1.endsWith("eclipse"));
		System.out.println(word1.startsWith("eclipse"));
		
		System.out.println(word1.toUpperCase().endsWith("PSE"));
		
		// Mr. Mrs. Ms. Dr.
		//Mr. ==>male
		//Mrs. ==> married woman
		//Ms. ==>Some woman
		//Dr. ==> Doctor amn or woman
		//Unknown status
		String word2 = "Mr. Jackson";
		System.out.println();
		if (word2.startsWith("Mr.")) {
			System.out.println("Male");
		} else if (word2.startsWith("Mrs.")) {
			System.out.println("Married woman");
		} else if (word2.startsWith("Ms.")) {
			System.out.println("Some woman");
		} else if (word2.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		} else {
			System.out.println("Unknown status");
		}
	}

}
