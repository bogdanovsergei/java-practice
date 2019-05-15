package assignments;
import java.util.*;
public class Assignment150 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    timeConversion(scan.nextLine());
	  }
	  
	  public static void timeConversion(String s) {
	    String[] time = s.split(":");
	    String PmAm = time[2].substring(2,4);
	    int hours = Integer.parseInt(time[0]),
	    	minutes = Integer.parseInt(time[1]),
	    	seconds = Integer.parseInt(time[2].substring(0,2));
	    
	    int newHours = 0;
	    if (hours>0 && hours<=12 && minutes>=0 && minutes<60 && seconds>=0 && seconds<60 && PmAm.equals("AM") || PmAm.equals("PM")) {
	    	if (PmAm.equals("AM")) {
	    		if (hours == 12) {
	    			newHours = 0;
	    		} else {
	    			newHours = hours;
	    		}
	    	} else {
	    		newHours = hours+12;
	    	}
	    	
	    } else {
	    	System.out.println("Invalid format!");
	    }
	    
	    String 	sHours = Integer.toString(newHours),
	    		sMinutes = Integer.toString(minutes),
	    		sSeconds = Integer.toString(seconds);
	    if (newHours<10) {
	    	sHours = "0" + sHours;
	    }
	    if (minutes<10) {
	    	sMinutes = "0" + sMinutes;
	    }
	    if (seconds<10) {
	    	sSeconds = "0" + sSeconds;
	    }
	    
	    System.out.println(sHours + ":" + sMinutes + ":" + sSeconds);
	  }

}
