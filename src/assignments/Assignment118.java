package assignments;
import java.util.*;
public class Assignment118 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    
	    int start=0;
	    int end = nums.length-1; 
	    int temp = 0;
	    while (start!=nums.length/2) {
	    	temp = nums[start];
	    	nums[start] = nums[end];
	    	nums[end] = temp;
	    	start++;
	    	end--;
	    }
	    
	    
	    //Do not change below statement:
	    System.out.println(Arrays.toString(nums));
	    
	}

}
