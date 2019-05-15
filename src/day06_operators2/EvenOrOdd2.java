package day06_operators2;

import java.util.Scanner; // import java.util.*;

public class EvenOrOdd2 {
	public static void main(String[] args) {
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write a whole number: ");
		int num = scan.nextInt(); 
			if (num !=0) {
				if (num%2 == 0 ) {	
					System.out.println(num + " is even.");
				}
				else { 
					System.out.println(num + " is odd.");
				}
			}
			else {
				System.out.println(num + " is Zero.");

	
		}
	}
}
