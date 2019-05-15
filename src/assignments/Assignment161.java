package assignments;

public class Assignment161 {

	public double waterTax(double units) {
		double bill = 0.0;

		// your code here
		if (units <= 50) {
			bill = units * 0.6;
		} else if (units > 50 && units <= 100) {
			bill = units * 0.9;
		} else if (units>100 && units<=150) {
			bill = units * 0.9 + 50;
		} else {
			bill = units * 0.9 + 100;
		}

		// end your code here

		return bill;
	}// end waterTax

}
