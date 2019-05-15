package day12;
import java.util.*;
public class CalculatorV02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num1, num2, result;
		
		System.out.println("Enter first number:");
		num1 = scan.nextDouble();
		System.out.println("Enter second number:");
		num2 = scan.nextDouble();
		System.out.println("Select OPERATION: +, -, *, /, %");
		String operator = scan.next();
		
		result = 0;
		switch(operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("Invalid operator!");
			return;
		}
		System.out.println("Result: " + result); 
	}

}
