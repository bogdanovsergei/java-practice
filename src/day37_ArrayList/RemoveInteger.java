package day37_ArrayList;
import java.util.*;
public class RemoveInteger {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(10);
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		
		
		nums.add(4);
		nums.add(1);
		nums.add(443);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		nums.remove(5);	// remove using index
		System.out.println(nums.toString());
		
		nums.remove("5");	//do nothing
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5);
		nums.remove(n1);
		System.out.println(nums.toString());
		
		nums.remove(Integer.valueOf(10));
		System.out.println(nums.toString());
	}

}
