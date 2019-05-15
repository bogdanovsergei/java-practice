package PracticeWithVasil;
import java.util.*;
public class CharPractice {
	public static void main(String[] args) {
		String phoneNumber = "(240) 567 7834";
		char[] chars = phoneNumber.toCharArray();
		System.out.println(Arrays.toString(chars));
		int digitCounter = 0;
		for (char value: chars) {
			if(Character.isDigit(value)) {
				digitCounter++;
			}
		}
		
		System.out.println("NUmber of digits: " + digitCounter);
		
		String name = "Mike";
		//Character.isAlphabetic(codePoint) - > to verify if the name is valid
		boolean isValid = false;
		for (int i=0; i<name.length(); i++) {
			char var = name.charAt(i);
			isValid = Character.isAlphabetic(var);
			if (isValid==true) {
				System.out.println(var + " : " + isValid);
			}
		}
	}

}
