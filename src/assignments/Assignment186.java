package assignments;
import java.util.*;
public class Assignment186 {
	public static void main(String[] args) {
		System.out.println(extractNum("asasd1w3e4d123"));
	}
	
	public static String extractNum(String s) {
	    char[] characters = s.toCharArray();
	    
	    for (int i=0; i<characters.length; i++) {
	    	if (!Character.isDigit(characters[i])) {
	    		characters[i] = '%';
	    	}
	    }
	    
	    String result = "";
	    for (int i=0; i<characters.length; i++) {
	    	if(characters[i] != '%') {
	    		result += characters[i];
	    	}
	    }
	   
	    return result;
	  }

}
