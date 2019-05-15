package day08_casting_conditional;

import java.util.*;
public class IfElseWithScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int passingPercentage = 65;
		
		System.out.println("Enter your Score: ");
		int yourScorePercentage = scan.nextInt();
		
		if (yourScorePercentage >= passingPercentage) {
			System.out.println("You passed!");
		} else {
			System.out.println("You failed.");
		}
		
	}

}
