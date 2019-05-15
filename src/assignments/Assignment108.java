package assignments;

import java.util.*;

public class Assignment108 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String email = input.nextLine();

		// Write your code below

		String[] str = email.split("@");
//		if (str == null || str.length > 2) {
//			System.out.println("invalid email");
//		} else {
//			System.out.println("Email id: " + str[0]);
//			System.out.println("Email domain: " + str[1]);
//		}
		for (int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
