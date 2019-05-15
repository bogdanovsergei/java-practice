package day19;
import java.util.*;
public class Transactions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the current balance?");
		double balance = scan.nextDouble();
		int countOfTransactions = 0;
		
		while (balance > 0) {
			countOfTransactions++;
			System.out.println("What is transaction #" + countOfTransactions + " amount?");
			Double transaction = scan.nextDouble();
			if (transaction>balance) {
				System.out.println("Your balance is about to be negative due to this transaction!");
//				continue; // go on top of loop rigth away
			}
			balance -= transaction;
			System.out.println("Current balance: " + balance);
			
		}
	
			System.out.println("You have isinsufficient funds for anymore transactions. Your balance is " + balance);
			System.out.println("Transactions total cont: " + countOfTransactions);
	}

}
