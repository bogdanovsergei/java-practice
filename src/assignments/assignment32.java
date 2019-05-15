package assignments;
import java.util.*;
public class assignment32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter price in cents:");
		int itemPrice = scan.nextInt();
				
		if (itemPrice <25 || itemPrice >100 || itemPrice%5 !=0) {
			System.out.println("Invalid price!");
			} else{ 
				int	quarters = (int)(100 - itemPrice)/25;
				int	dimes = (int)(100 - itemPrice)%25/10;
				int nickels = (int)(100 - itemPrice)%25%10/5;
				System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
				
			}
		
		
		
	}

}
