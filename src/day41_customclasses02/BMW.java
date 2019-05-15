package day41_customclasses02;

public class BMW {
	String make = "BMW";
	String model;
	double price;

	/*
	330i - 40,250
	740i - 86,450
	m3 - 66,500
	 */
	public void showPrice() {
		switch (model) {
		case "330i":
			price = 40250;
			break;
		case "740i":
			price = 86450;
			break;
		case "m3":
			price = 66500;
			break;
		default:
			System.out.println(model + " is not available");
		}
		
		System.out.println("Price: " + price);
	}
}
