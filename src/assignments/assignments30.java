package assignments;
import java.util.*;
public class assignments30 {
	public static void main(String[] args) {
		
	
	Scanner keybord = new Scanner(System.in);
    int inputSeconds, hours, minutes, seconds;
    
    System.out.println("Enter seconds:");
    int sec = keybord.nextInt();
    hours = (int)sec/3600;
    minutes = (int)(sec%3600)/60;
    seconds = sec%60;
    System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
	}
    

}
