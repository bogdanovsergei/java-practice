package day41_customclasses02;
import java.util.*;
public class WarmUpWithList {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(15);
		nums.add(2);
		
		System.out.println(DoubleTheList(nums));
	}
	
	public static List<Integer> DoubleTheList (List<Integer> nums) {
		for(int i=0; i<nums.size(); i++) {
			nums.set(i, nums.get(i)*2);
		}
		return nums;
	}

}
