package day27_arrays05;

import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = { 4, 6, 7, 10, 55 };
		System.out.println(Arrays.binarySearch(nums, 55));
		System.out.println(Arrays.binarySearch(nums, 45));
		
		int i=Arrays.binarySearch(nums, 10);
		System.out.println(i);
		
		int[] nums2 = {40, 6, 17, 10, 55}; 
		Arrays.sort(nums2);							//Array for Binary search has to be sorted
		System.out.println(Arrays.binarySearch(nums2, 40));
		
		
		
	}

}
