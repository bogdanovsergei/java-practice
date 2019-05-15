package day12;
import java.util.*;
public class CalculatorV01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1, num2, result;
		
		System.out.println("Enter first number:");
		num1 = scan.nextDouble();
		System.out.println("Enter second number:");
		num2 = scan.nextDouble();
		System.out.println("Select OPERATION: +, -, *, /, %");
		String operator = scan.next();
		
		result = 0.0;
		if ( operator.contentEquals("+"))
			result = num1 + num2;
		else if (operator.contentEquals("-"))
			result = num1 - num2;
		else if (operator.contentEquals("*"))
			result = num1 * num2;
		else if (operator.contentEquals("/"))
			result = num1 / num2;
		else if (operator.contentEquals("%"))
			result = num1 % num2;
		else {
			System.out.println("Invalid operator!");
			return; // Do not execute the remaining code. Stop here
					//get out from main method
		}
			
		System.out.println("Result: " + Math.round(result)); // okruglyaet
		
		
	}

}
