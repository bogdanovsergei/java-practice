package day15_string_manipulation;
import java.util.*;
public class WarmUpEmojies {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter emoji: ");
		String emoji = scan.next();
		if (emoji.length()!=2) {
			System.out.println("Invalid emoji.");
			return;
		}
		if (emoji.charAt(0) == ':') {
			switch (emoji.charAt(1)) {
			case ')':
				System.out.println("Smile");
				break;
			case '(':
				System.out.println("Sad");
				break;
			case '/':
				System.out.println("Upset");
				break;
			case 'p':
				System.out.println("Playful");
				break;
			default:
				System.out.println("Unknown emoji");
			}
		} else if (emoji.charAt(0) == ';') {
			switch (emoji.charAt(1)) {
			case ')':
				System.out.println("Wink");
				break;
			case '0':
				System.out.println("surprised");
				break;
			default:
				System.out.println("Unknown emoji");
			}
		} else if (emoji.charAt(0) == ')') {
			if (emoji.charAt(1) == ':')
				System.out.println("sad");
			else 
				System.out.println("Unknown emoji");
			
		} else if (emoji.charAt(0) == '(') {
			if (emoji.charAt(1) == ':')
				System.out.println("smile");
			else 
				System.out.println("Unknown emoji");
		}
		
	}

}
