package day31_methods03;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		countUp(5);
		int n = 10;
		countUp(n);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num:");
		int inputNum = scan.nextInt();
		countUp(inputNum);
	}
	

	private static void countUp(int num) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<= num; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	

}
