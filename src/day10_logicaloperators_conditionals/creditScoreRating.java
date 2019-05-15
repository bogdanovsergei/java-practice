package day10_logicaloperators_conditionals;
import java.util.*;
public class creditScoreRating {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your credit score:");
		int creditScore = scan.nextInt();
		
		if (creditScore>=750 && creditScore<=850) {
			System.out.println("Exellent");
		}
		
		else if (creditScore>=700 && creditScore<750) {
			System.out.println("Good");
		}
		
		else if (creditScore>=650 && creditScore<700) {
			System.out.println("Fair");
		}
		
		else if (creditScore>=550 && creditScore<650) {
			System.out.println("Fair");
		}
		
		else if (creditScore>=0 && creditScore<550) {
			System.out.println("Fair");
		} 
		else System.out.println("Invalid score");
		
		
		
		
	}

}
