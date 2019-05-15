package day14_string_method;

public class StringSize {
	public static void main(String[] args) {
		String str1 = "Good Morning";
		// check if it matches "Good Morning"
		if (str1.contentEquals("Good Morning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not Match");
		}
		
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println(("Match - ignore case"));
		} else {
			System.out.println("Not Match - ignore case");
		}
		
		//Convert to all uppercase
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1); // it stays as old value, not Uppercase
		
		str1 = str1.toUpperCase();
		System.out.println("After assignment - " + str1);
		
		// combine the above methods together
		
		if (str1.toLowerCase().equals("good morning")) { 
			System.out.println("Chained methods: match");
		} else {
			System.out.println("Chained methods: do not match");
		}
		
		// Find out how many characters in the string
		
		String myName = "Sergei";
		System.out.println(myName.length());
		
		int lenght = myName.length();
		System.out.println("My name's length is "+ lenght );
		
		// usernames mast be exactly 8 characters
		
		String userName = "Sergei";
		if (userName.length() == 8) {
			System.out.println("Valid name");
		} else {
			System.out.println("Invalid name");
		}
		
		//password must be at least 6 characters
		
		String password = "1234567";
		if (password.length() >= 6 ) {
			System.out.println("Valid password");
		} else {
			System.out.println(("Invalid password"));
		}
		
		
	}

}
