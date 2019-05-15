package day21_loops_practice;

import java.util.*;

public class WarmTaskGoodNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num1, num2, sum;
		do {
		System.out.println("Enter 2 numbers:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		sum=num1+num2;
		} while (sum <= 100);
		System.out.println("Good numbers");
	}

}