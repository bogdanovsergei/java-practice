package day18_while_dowhile_loops;

public class Alphabet {
	public static void main(String[] args) {
		char letter= 'a';
		
		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;
		}
		
		System.out.println();
		char capital = 'A';
		while (capital <= 'Z') {
			System.out.print(capital + " ");
			capital++;
		}
		
		System.out.println();
		char reverse = 'z';
		while (reverse >= 'a') {
			System.out.print(reverse + " ");
			reverse--;
		}
		
		System.out.println();
		char myLetter = 'A';
		String letters = "";
		while (myLetter<='Z') {
			letters = letters + myLetter;
			myLetter++;
			System.out.println(letters);
		}
			
		
	}

}
