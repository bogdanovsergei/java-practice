package assignments;

import java.util.Arrays;

public class Assignment167 {
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("avocado") ) ;
	    
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    boolean isAppeared = false,
	    		isDuplicate = false;
	    String result = "";
	    //rename duplicatedChars
	    char[] uniqueChars = new char[str.length()];	// this array stores all unique chars
	    
	    for (int i=0; i<str.length(); i++) {
	      for (int j=0; j<str.length(); j++) {
	        if (str.charAt(i)==str.charAt(j) && i!=j) { //we don't need to compare current char with itself
	          isAppeared = true;
	          break;			// cause we don't need extra checking. 
	          					//Program should work as faster as possible
	        }
	      }
	      
	      if (isAppeared) {							//show us if the current char appears in the word
	    	  for (int k=0; k<uniqueChars.length; k++) {	//going through array which consist of unique chars
	    		  if (str.charAt(i) == uniqueChars[k]) {	//checking if the current char is already in array of unique chars
	    			  isDuplicate = true;						//if it's not - we don't do nothing
	    			  break;
	    		  }
	    	  }
	      }
	      
	      if (isDuplicate == false) {				//if there are no the current char in array we need to add it to array
	    	  uniqueChars[i] = str.charAt(i);
	    	  result += str.charAt(i);
	      }
	      
	      isDuplicate = false; //reseting 2 boolean variables for next cycle
	      isAppeared = false;
	    }
	    
	    return result;
	  }

}
