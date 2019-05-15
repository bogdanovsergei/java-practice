package day33_methods05;

public class CalcTest {
	public static void main(String[] args) {
		System.out.println(Calculator.add(10, 20));
		System.out.println(Calculator.multiply(5, 6));
		System.out.println(Calculator.minus(40, 12));
		System.out.println(Calculator.divide(100, 20));
		
		int addResult = Calculator.add(21, 41);
		double mResult = Calculator.multiply(50, 20);
		
		if (Calculator.add(10, 16) == 26) {
			System.out.println("AddUnit test passed");
		} else {
			System.out.println("AddUnit test failed");
		}
	}

}
