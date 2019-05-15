package assignments;

import java.util.*;

public class Ass80_FreeBook {
	public static void main(String[] args) {
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();
		
		if (isPremiumCustomer == true) {
			if (nbooksPurchased >= 5 && nbooksPurchased < 8) {
				freeBooks = 1;
			} else if (nbooksPurchased>8) {
				freeBooks = nbooksPurchased/8 *2;
			}
		} else {
			if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
				freeBooks = 1;
			} else if (nbooksPurchased>8) {
				freeBooks = nbooksPurchased/12 *2;
			}
		}
		
		System.out.println(freeBooks);

	}

}
