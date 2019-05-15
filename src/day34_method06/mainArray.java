package day34_method06;
import java.util.*;
public class mainArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		
		int[] nums = CountArray.getArray(); 
		System.out.println(Arrays.toString(nums));
		
		//for(;;) {		// keep looping (infinity)
		System.out.println(Arrays.toString(CountArray.getRandomArray(10))); 
		//}
		int[] randomNums = CountArray.getRandomArray(3);
		System.out.println(Arrays.toString(randomNums));
	}
	
	

}
