package day08_casting_conditional;

public class CastingPrimitives {
	public static void main(String[] args) {
		//cast double value to int
		int i = (int)3.4;
		System.out.println("i : " + i);
		
		double price = 230.50;
		int dollars = (int)price;
		System.out.println("Price: " + dollars);
		
		//WHOLE NUMBERS. byte, short, int
		int count = 1237;
		byte byteCount = (byte)count;
		System.out.println("ByteCount: " + byteCount);
		
		long longValue = 123123L;
		int intValue = (int)longValue;
		System.out.println("IntValue: " + intValue );
		
		int large = 5678;
		short small = (short)large;
		System.out.println("Small: " + small);
					//250		//250.2
		int result = (int)(500.4 / 2.0);
		System.out.println("Result: " + result);
		
		
	}
}
