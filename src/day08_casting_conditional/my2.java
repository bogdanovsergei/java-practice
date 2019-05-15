package day08_casting_conditional;

import java.util.*;
public class my2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2+2?: ");
		System.out.println("1) 5; \n2) 3; \n3) 4; \n4) 6.");
		int result = scan.nextInt();
		
		
		switch (result) {
		case 1:
			System.out.println("Incorrect.");
			break;
		case 2:
			System.out.println("Incorrect.");
			break;
		case 3:
			System.out.println("Correct!");
			break;
		case 4:
			System.out.println("Incorrect.");
			break;
		default:
			System.out.println("You entered wrong number.");
			
		}
	}

}
