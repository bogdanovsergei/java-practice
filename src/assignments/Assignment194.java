package assignments;
import java.util.*;
public class Assignment194 {
	public static void main(String[] args) {
		boolean b = isPalindrome("n usqww qsun");
		System.out.println(b);
		
	}
	
//	public static boolean isPalindrome(String check) {
//	    ArrayList<Character> chars = new ArrayList<>();
//		
//		for(int i=0; i<check.length(); i++) {
//			if(check.charAt(i) != ' ') {
//				chars.add(check.charAt(i));
//			}
//		}
//		
//		int count = 0;
//		for (int j=0; j<chars.size()/2; j++) {
//			if(chars.get(j)==chars.get(chars.size()-1-j)) {
//				count++;
//			}
//		}
//		
//		if (count == chars.size()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public static boolean isPalindrome(String check) {
		
		check = check.replaceAll(" ", "");
		check = check.toLowerCase();
		
		int count = 0;
		for (int j=0; j<check.length()/2; j++) {
			if (check.charAt(j) == check.charAt(check.length()-1-j)) {
				count++;
			}
		}
		
		if (count == check.length()/2) {
			return true;
		} else {
			return false;
		}
	}

}
