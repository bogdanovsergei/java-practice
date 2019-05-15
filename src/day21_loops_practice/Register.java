package day21_loops_practice;
import java.util.*;
public class Register {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String items = "", item = "";
		Double totalPrice = 0.0, price = 0.0;
		
		System.out.println("How many times are you purchasing?");
		int countItems = scan.nextInt();
		for (int i=1; i<=countItems; i++) {
			System.out.println("What is item " + i + "?");
			item = scan.next();
			System.out.println("How much is " + i + " item?");
			price = scan.nextDouble();
			items = items + item + ", ";
			totalPrice = totalPrice + price;
			
		}
		
		System.out.println("Your items: " + items.substring(0, items.length()-2) + ".");
		System.out.println("Total price: " + totalPrice);
	}

}
