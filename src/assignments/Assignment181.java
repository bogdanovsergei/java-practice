package assignments;
import java.util.*;
public class Assignment181 {
	public static String combineRs(String[] r1,String[] r2) 
	  {
	    ArrayList<String> arr = new ArrayList<>();
	    for (int i=0; i<r1.length; i++) {
	      arr.add(r1[i]);
	    }
	    for (int i=0; i<r2.length; i++) {
	      arr.add(r2[i]);
	    }
	    String result = "";
	    for (String ch: arr) {
	      result +=ch;
	    }
	    return result;
	  
	   
	  }

}
