package day38_arraylist03;
import java.util.*;
public class ContainsAll {
	public static void main(String[] args) {
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10); nums1.add(20); nums1.add(30); nums1.add(40); nums1.add(50);
		
		List<Integer> nums2 = new ArrayList<>();
		nums1.add(20); nums1.add(10); nums1.add(30); nums1.add(30);
		
		//test if nums1 has all nums2 values
		
		if (nums1.containsAll(nums2)) {
			System.out.println("Nums1 contains all num2");
		} else {
			System.out.println("Nums1 does not contain nums2");
		}
		
		boolean b = nums1.containsAll(nums2) && nums2.containsAll(nums1); // equals but not the same order
		System.out.println(b);
		
		List<String> planA = new ArrayList<>();
		planA.add("java");
		planA.add("replit");
		planA.add("ping pong");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");
		
		List<String> planB = new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("java");
		planB.add("ping pong");
		planB.add("replit");
		
		
		//check if both have the same values, ignoring order
		if (planB.containsAll(planA) && planA.containsAll(planB)) {
			
		}
		
	}

}
