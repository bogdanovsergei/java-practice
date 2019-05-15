package day16_string_manipulation;
import java.util.*;
public class AdditionalAssignments {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 1st integer:");
		int num1 = scan.nextInt();
		System.out.println("Input 2nd integer:");
		int num2 = scan.nextInt();
		float average = (num1+num2)/2;
		System.out.println("Sum of two integers: " + (num1+num2));
		System.out.println("Difference of two integers: " + (num1-num2) );
		System.out.println("Product of two integers: " + num1*num2);
		System.out.println("Average of two integers: " + average);
		System.out.println("Distance of two integers: " + Math.abs(num1-num2));
		int max = num1>num2 ? num1 : num2;
		System.out.println("Max integer: " + max);
		int min = num2>num1 ? num1 : num2;
		System.out.println("Min integer: " + min);
		
	}
}
