package day23_arrays;
import java.util.*;
public class WarmTask {
	public static void main(String[] args) {
		//Scanner scan = new Scanner (System.in);
		System.out.println("Enter number:");
		int num = new Scanner (System.in).nextInt();
		int count = 0;
		
		for (int i = 1; i<=num; i++) {
			if (num%i == 0) {
				count++;
			}
		}
		
		if (count == 2) {
			System.out.println(num + " - it's a prime number.");
		} else {
			System.out.println(num + " - it's not a prime number");
		}
		
	}

}
