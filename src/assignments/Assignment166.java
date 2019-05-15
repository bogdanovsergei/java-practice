package assignments;

public class Assignment166 {
	public static void main(String[] args) {
		System.out.println(mergeStrings("oneqw", "two"));
	}
	
	public static String mergeStrings(String one, String two) {
	    String result = "";
	    
	    for (int i=0; i<one.length(); i++) {
	    	if (i <= two.length()-1) {
	    		result += one.charAt(i) + "" + two.charAt(i) + "";
	    	} else {
	    		break;
	    	}
	    }
	    
	    if (one.length() > two.length()) {
	    	result += one.substring(two.length());
	    } else if (one.length() < two.length()) {
	    	result += two.substring(one.length());
	    }
	    
	    return result;
	  }

}
