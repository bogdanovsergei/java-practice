package day18_while_dowhile_loops;
import java.util.*;
public class EnterPinCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretPincode = 1234;
		int pincode = 0;
		
		while (pincode != secretPincode) {
			System.out.println("Enter Pin Code:");
			pincode = scan.nextInt();
		}
		
		System.out.println("Access granted.");
	}

}