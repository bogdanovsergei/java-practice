package day23_arrays;
import java. util.*;
public class SumOfWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String sum = "";
		
		for (int i=0; i<6; i++) {
			System.out.println("Type a word:");
			String word = scan.next();
			if (word.equals("java")) {
				continue;
			}
			sum +=word + ", ";
		}
		
		System.out.println("All words: " + sum.substring(0, sum.length()-2));
	}

}
