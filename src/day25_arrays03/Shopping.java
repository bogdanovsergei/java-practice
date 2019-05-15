package day25_arrays03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas socks"};
		double[] prices = {120.0, 5.99, 150.5, 3000.5, 6.99};
		int[] itemsId = {12345, 12346, 12347, 12348, 12349};
		
		System.out.println("Product count: " + products.length);
		
		if (products.length == prices.length && products.length ==itemsId.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is wrong with this list");
		}
		
		for (String product: products) {
			System.out.println(product);
		}
		
		for (int i=0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		for (int i=itemsId.length-1; i>=0; i--) {
			System.out.println(itemsId[i]);
		}
		
		double totalPrice = 0.0;
		for (int i=0; i<products.length; i++) {
			System.out.println("Item " + (i+1) + ": " + itemsId[i] + " - " + products[i] + " - $" + prices[i]);
			totalPrice += prices[i];
		}
		System.out.println("Total Price: $" + totalPrice);
		
		int maxIndex = 0;
		double maxPrice = 0;
		for (int j=0; j<prices.length; j++) {
			if (prices[j]> maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
			}
		}
		System.out.println("Max Price: " + itemsId[maxIndex] + " - " + products[maxIndex] + " - $" + maxPrice);
	}

}
