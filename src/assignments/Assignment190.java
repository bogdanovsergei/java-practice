package assignments;
import java.util.*;
public class Assignment190 {
	
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums) {
		ArrayList<Integer> newArr = new ArrayList<>();
		
		int sum = 0;
		for(int i=0; i<nums.size(); i++) {
			if(nums.get(i)>0) {
				newArr.add(nums.get(i));
				sum += nums.get(i);
			}
		}
	
		newArr.add(sum);
		
		
		return newArr;
	}
}
