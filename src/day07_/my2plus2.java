package day07_;

import java.util.*;
public class my2plus2 {
	public static void main(String[] args) {
		int i = 0;
		int result=0;
		String name;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = scan.next();
		
		System.out.println("Hello, " + name + "! Please, answer: What's a result of 2+2 ?");
		result = scan.nextInt();
		
		while (result != 4) {
			
			System.out.println("Incorrect. Try again.");
			result = scan.nextInt();
			i++;
		}
		
		
		
		if (i==0) {
			System.out.println("Great! You did it the first time!");
			
		} else {
			System.out.println("Correct, you tryed it " + i + " times.");
		}
		
	}

}