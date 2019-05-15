package assignments;
import java.util.*;
public class Ass73 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    String 	firstName = email.substring(0,1).toUpperCase() + email.substring(1, email.indexOf("_")),
	    		lastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase() + email.substring(email.indexOf("_")+2, email.indexOf("@"));
	    		//firstName = firstName.replaceFirst(email.charAt(0), email.charAt(0).toUpperCase());
	    		System.out.println(	"First name: "+ firstName  + "\n" +
	    							"Last name: " + lastName + "\n" +
	    							"Domain: " + email.substring(email.indexOf("@")+1, email.indexOf(".")) + "\n" +
	    							"Top-Level Domain: " + email.substring(email.indexOf(".")+1, email.length()));
	    
	}

}
