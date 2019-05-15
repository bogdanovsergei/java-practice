package assignments;

import java.util.*;

public class BGEBillCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of kW⋅h:");
		int kwh = scan.nextInt();
		int i = 0;
		double bill = 0.0;
		if (kwh > 0 && kwh <= 200) {
			bill = 100.0;
		} else {
			i = 200;
			bill = 100;
			while (i < kwh) {
				bill = bill + 0.4;
				i++;
				if (i == 275 && kwh >= 275) {
					while (i < kwh) {
						bill = bill + 0.35;
						i++;
						if (i > 400 && kwh > 400) {
							while (i < kwh) {
								bill = bill + 0.25;
								i++;
							}
						}
					}

				}
			}

		}

		System.out.println("Your bill this month is: $" + bill);
	}
}
