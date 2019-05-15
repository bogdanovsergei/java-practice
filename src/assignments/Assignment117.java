package assignments;
import java.util.*;
public class Assignment117 {
	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	}
	
	public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
	    int count = 0;
	    for (int i=0; i<arr.length; i++) {
	    	char[] chars = arr[i].toCharArray();
	    	for (int j=0; j<chars.length; j++) {
	    		if (chars[j] == 'e') {
	    			count++;
	    			break;
	    		}
	    	}
	    }
	    
	    String[] fewValues = new String[count];
	    count = 0;
	    for (int i=0; i<arr.length; i++) {
	    	char[] chars = arr[i].toCharArray();
	    	for (int j=0; j<chars.length; j++) {
	    		if (chars[j] == 'e') {
	    			fewValues[count] = arr[i];
	    			count++;
	    			break;
	    		}
	    	}
	    }
	    
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	  }

}
