package assignments;
import java. util.*;
public class Assignment104 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    int count =0;
	    for (int i=0; i<4; i++) {
	    	if (nums[i] == nums [i+1] && nums[i]==5) {
	    		count++;
	    	}
	    }
	    
	    if (count>0) {
	    	System.out.println(true);
	    } else {
	    	System.out.println(false);
	    }
	}

}
