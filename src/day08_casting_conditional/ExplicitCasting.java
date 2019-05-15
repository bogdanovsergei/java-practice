package day08_casting_conditional;

public class ExplicitCasting {
	public static void main(String[] args) {
		
		System.out.println(10 / 2.0);
		System.out.println(10.0 / 2);
		
		int result = (int)(10 / 2.0); // int result = 10 / (int)2.0;
		System.out.println(result);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average = (double)(rent1 + rent2 + rent3 + rent4) / 4; //   or /4.0
		System.out.println(average);
		
		double d = 40.2;
		int i = (byte)d;
		// in above statement explicit and implicit casting happening.
		//explicit: double > byte
		//implicit: byte > int
		System.out.println(i);
		
	}

}
