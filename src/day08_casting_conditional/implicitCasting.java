package day08_casting_conditional;

public class implicitCasting {
	public static void main(String[] args) {
		//automatic casting from larger to smaller type
		
		short shortValue = 3455;
		int intValue = shortValue;
		System.out.println("intValue: " + intValue);
		
		double price = 345;
		System.out.println("Price after casting: " + price);
		
		int price1 = 34545;
		double dPrice = price1;
		System.out.println("dPrice after casting: " + dPrice);

		
	}

}
