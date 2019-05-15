package assignments;
import java.util.*;
public class ass46 {
	public static void main(String[] args) {
		int num, digit1, digit2, digit3, digit4, digit5;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		num = scan.nextInt();
		digit1 = (int)num/10000;
		digit2 = (int)num/1000;
		digit3 = (int)num/100;
		digit4 = (int)num/10;
		digit5 = num%10;
		System.out.println(digit1 + "\n" + digit2 + "\n"+ digit3 + "\n"+ digit4 + "\n"+ digit5);
		
	}
}
