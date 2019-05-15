package assignments;
import java.util.*;
public class Assignment117_modified {
	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };
		System.out.println(getWithE(numbers).toString());

	}
	
	public static ArrayList<String> getWithE(String[] arr) {
		ArrayList<String> containsE = new ArrayList<>();
		//List<Character> containsE1 = new StringCharacterList("asd");
		
		for (int i=0; i<arr.length; i++) {
	    	char[] chars = arr[i].toCharArray();
	    	for (int j=0; j<chars.length; j++) {
	    		if (chars[j] == 'e') {
	    			containsE.add(arr[i]);
	    			break;
	    		}
	    	}
		}
		
		return containsE;
	}

}
