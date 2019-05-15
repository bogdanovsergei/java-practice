package assignments;

import java.util.*;

public class Assignment86 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();

		for (int i = 0; i < word.length(); i++) {
			if (word.indexOf("cat", i) != word.indexOf("cat", i+1)) {
				countOfCats++;
			}
		}
		
		for (int i = 0; i < word.length(); i++) {
			if (word.indexOf("dog", i) != word.indexOf("dog", i+1)) {
				countOfDogs++;
			}
		}
		
		if (countOfCats == countOfDogs)
			System.out.println(true);
		  else 
			System.out.println(false);

	}

}
