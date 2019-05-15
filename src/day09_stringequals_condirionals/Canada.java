package day09_stringequals_condirionals;
import java.util.*;

public class Canada {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the capital of Canada?");
		String capital = keyboard.nextLine();
		
		if (capital.equalsIgnoreCase("Ottawa")) {
			System.out.println("Your answer is correct!");
		} else {
			System.out.println("Your answer is incorrect! " + capital + " is not capital of Canada.");
		}
		
	}

}
