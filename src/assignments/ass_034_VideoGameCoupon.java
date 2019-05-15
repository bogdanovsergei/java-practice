package assignments;
import java.util.*;
public class ass_034_VideoGameCoupon {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter number of coupons:");
	int coupons = keyboard.nextInt();
	
	int candies = (int)coupons/10;
	int gumballs = (int)coupons%10 / 3;
	
	if (coupons >= 3) {
		candies = (int)coupons/10;
		gumballs = (int)coupons%10 / 3;
		System.out.println("Number of Candies: " + candies);
		System.out.println("Number of Gumballs: " + gumballs);
	} else 
		System.out.println("Not enough coupons");
			
	
	
	
	}

}
