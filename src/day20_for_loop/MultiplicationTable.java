package day20_for_loop;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		
		//check if it is valid. 1-10
		
		if (num<1 || num >10) {
			System.out.println("Invalid number");
			return;
		}
		
		//multiple by 1-10
		for (int i=1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

}
