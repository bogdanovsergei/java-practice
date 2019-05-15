package assignments;
import java.util.*;
public class Assignment170 {
	public static void main(String[] args) {
		System.out.println(clean("he said bla bla bla", "bla"));
	}
	
	public static String clean (String text ,String badWord) {
		String[] words = text.split(" ");
		String result = "";
		for (int i=0; i<words.length; i++) {
				if (!words[i].equals(badWord)) {
					result += words[i] + " ";
				}
			
		}
		result = result.trim();
		return result;
	}

}
