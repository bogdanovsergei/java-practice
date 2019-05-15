package day23_arrays;
import java.util.*;
public class BruteForce {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String expctedUserName = "admin";
		String expctedpassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 5;
		
		do {
			if (attempts -- == 0) {
				System.out.println("You have exceeded number of attempts");
				System.out.println("This user has been deactivated for 30 minutes");
				return;
			}
			System.out.println("Please enter username:");
			username = scan.next();
			if (!username.contentEquals(expctedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Attempts left: " + attempts);
				continue;
			}
			System.out.println("Please enter password:");
			password = scan.next();
			if (!password.contentEquals(expctedpassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left: " + attempts);
			}
			
		} while (!username.equals(expctedUserName) || !password.equals(expctedpassword));
		System.out.println("Login successful!");
		
		
	}

}
