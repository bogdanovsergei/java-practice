package assignments;
import java. util.*;
public class Assignment98 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		int index1 = json.indexOf("firstName\": \"");
		String firstName = json.substring(index1+13, json.indexOf("\"", index1+13));
		
		int index2 = json.indexOf("lastName\": \"");
		String lastName = json.substring(index2+12, json.indexOf("\"", index2+12));
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
	}

}
