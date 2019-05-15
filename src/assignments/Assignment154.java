package assignments;
import java.util.*;
public class Assignment154 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	
	public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
		int check = 1;
		int count = 0;
	    while (num/check>0) {		//checking count of numbers
	    	check *=10;
	    	count++;
	    }
	    //System.out.println(count);
	    int max = 1;
	    for (int i=1; i<count; i++) {
	    	max *=10;
	    }
	    //System.out.println(max);
	    
	    int count2 = 0;
	    int reminder = 10;
	   
	    if (num % reminder == num / max) {
	    	for (int i=1; i<=count/2; i++) {
	    		reminder *=10;
		    	if ((num % reminder)/reminder/10 == (num % max)/max/10) {
		    		count2++;
		    	}
		    	max /= 10;
	    	}
	    }
	    
	    if (count2 == count/2) {
	    	System.out.println(true);
	    } else {
	    	System.out.println(false);
	    }
	    
	    
	    /*											//*******
	    if( 	num%10 == num/1000000 && 			//******^ && ^******
	            num%100/10 == num%1000000/100000 &&	//*****^* && *^*****
	            num%1000/100 == num%100000/10000	//****^** && **^****
	            
	            ) {
	          System.out.println(true);
	        } else {
	          System.out.println(false);
	        }
	    */
	  }

}
