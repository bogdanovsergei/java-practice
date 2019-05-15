package day08_casting_conditional;
import java.util.*;
public class VotingEligibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int votingAge = 18;
		System.out.println("How old are you?");
		int yourAge = scan.nextInt();
		
		if (yourAge >= votingAge) {
			System.out.println("You are eligible to vote.\n"
							+ "You have been eligible for " +(yourAge-votingAge) + " years");
		} else {
			System.out.println("You are not eligible to vote\n"
							+ "You still have " + (-(yourAge - votingAge)) + " more years to go");
		}
		
	}

}
