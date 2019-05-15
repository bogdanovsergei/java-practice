package day33_methods05;

public class Calculator {
	public static void main(String[] args) {
		addVoid(10, 20);
		System.out.println(add(10, 20));
		System.out.println(multiply(10, 20));
		System.out.println(divide(20, 0));
		System.out.println(minus(20, 10));
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static double divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2 == 0) {
			System.out.println("Cannot divide by 0");
			return 0;
		} else {
			double sum = num1 / num2;
			return sum;
		}
	}

	public static int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
