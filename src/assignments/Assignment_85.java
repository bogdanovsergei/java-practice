package assignments;

import java.util.*;

public class Assignment_85 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0.0;

		do {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			System.out.println("Add one more item?");
			countinue = scan.next();
			count++;
			totalPrice += price;
			shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
		} while (countinue.equalsIgnoreCase("Yes") && count <= 10);

	    shoppingListReport = shoppingListReport.substring(0,shoppingListReport.length()-2);

		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalPrice);

	}
}
