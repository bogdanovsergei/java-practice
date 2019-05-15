package day34_method06;

public class MethodOverloading {
	public static void main(String[] args) {
		add(10,20);
		add("one", "two");
		add(23.45, 23.43);
		
		long l1 = 1234L;
		long l2 = 234234L;
		add(l1,l2);
	}
	
	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Result: " + result);
	}
	
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result: " + result);
	}

	public static void add(String str1, String str2) {
		String result = str1 + str2;
		System.out.println("Result: " + result);
	}
	
	public static void add(long num1, long num2) {
		long result = num1 + num2;
		System.out.println("Result: " + result);
	}
}
