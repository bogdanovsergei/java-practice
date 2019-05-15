package assignments;

import java.util.*;

public class Assignment102 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

//	    for (int i=0; i<3; i++) {
//	    	words[0] = sentence.substring(0, sentence.indexOf(" ", sentence.indexOf(" ", 0)+1));
//	    	
//	    	words[i] = sentence.substring(j+1, sentence.indexOf(" ", j+1));
//	    	j++;
//	    	
//	    	words[2] = sentence.substring(j+1, sentence.length());
//	    	System.out.println(words[2]);
//	    	System.out.println(words[1]);
//	    	System.out.println(words[0]);
//			}
		int i = 0;
		int count = 0;
		
		String[] str = sentence.split(" ");
		
		
		
		if (!sentence.contains(" ")) {
			System.out.println(sentence);
		} else {
			do {
				i = sentence.indexOf(" ", i) + 1;
				count++;
			} while (sentence.indexOf(" ", i) > -1);

			String[] words = new String[count + 1];

			i = 0;
			count = 0;
			do {
				words[count] = sentence.substring(i, sentence.indexOf(" ", i));
				i = sentence.indexOf(" ", i) + 1;
				count++;
			} while (sentence.indexOf(" ", i) > -1);

			// last word
			words[words.length - 1] = sentence.substring(i, sentence.length());

			for (int k = words.length - 1; k >= 0; k--) {
				System.out.println(words[k]);
			}
		}

	}

}