package day08_casting_conditional;

import java.util.Scanner;

public class PhoneNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Area Code: ");
		int areaCode = scan.nextInt();
		System.out.println("Enter local number: ");
		int localNumber = scan.nextInt();
		String phoneNumber = "(" + areaCode + ")" + localNumber;
		System.out.println("Calling number ".toUpperCase());
		
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7
		
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		
	}

}
