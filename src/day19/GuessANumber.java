package day19;
import java.util.*;
public class GuessANumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int secretNumber = random.nextInt(101);
		int guessNumber = 0;
		do {
			System.out.println("Guess a number:");
			guessNumber = scan.nextInt();
			if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			} else if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} 
		} while (guessNumber != secretNumber);
	
		System.out.println("Bingo! Congratulation! You won!");	
		
		
		
	}

}
