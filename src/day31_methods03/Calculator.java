package day31_methods03;

import java.util.*;

public class Calculator {
	// add, subtract, multiply, divide, remainder
	public static void main(String[] args) {
		add(12, 15);
		divide(12, 3);
		// using Scanner

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+', '-', '*', '/', '%'");
		String operator = scan.next();

		switch (operator) {
			case "+":
				add(n1, n2);
				break;
			case "-":
				subtract(n1, n2);
				break;
			case "/":
				divide(n1, n2);
				break;
			case "*":
				multiply(n1, n2);
				break;
			case "%":
				remainder(n1, n2);
				break;
			default:
				System.out.println("Invalid operator");

		}

	}

	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result: " + result);
	}

	public static void subtract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Result: " + result);
	}

	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Result: " + result);
	}

	public static void divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("cannot / by zero");
			return; // Exit the method here. Go to the main method.
		}
		double result = num1 / num2;
		System.out.println("Result: " + result);

	}

	public static void remainder(double num1, double num2) {
		double result = num1 % num2;
		System.out.println("Result: " + result);
	}
}
