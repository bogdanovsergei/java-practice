package assignments;

import java.util.*;
public class assignament28 {
	public static void main(String[] args) {
		String item1, item2, item3, report;
		double price1, price2, price3, totalPrice;
		int count1, count2, count3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Item1, count and its price:");
		item1 = scan.next();
		count1 = scan.nextInt();
		price1 = scan.nextDouble()*count1;
		
		System.out.println("Enter Item2, count and its price:");
		item2 = scan.next();
		count2 = scan.nextInt();
		price2 = scan.nextDouble()*count2;
		
		System.out.println("Enter Item3, count and its price:");
		item3 = scan.next();
		count3 = scan.nextInt();
		price3 = scan.nextDouble()*count3;
		
		totalPrice = 0;
		report = "";
		if (count1 > 0) {
			totalPrice = totalPrice + price1;
			report = report + "Item1: " + item1 + " Price: " + price1;
		};
		
		if (count2 > 0) {
			totalPrice = totalPrice + price2;
			if (count1 > 0) {
			report = report + ", Item2: " + item2 + " Price: " + price2;
			} else {
				report = report + "Item2: " + item2 + " Price: " + price2;
			}
		};
		
		if (count3 > 0) {
			totalPrice = totalPrice + price3;
			if (count1>0 || count2>0) {
			report = report + ", Item3: " + item3 + " Price: " + price3;
			} else {
				report = report + "Item3: " + item3 + " Price: " + price3;
			}
		};
		
		System.out.println(report);
		System.out.println("Total price: " + totalPrice);
		
		
	}

}
