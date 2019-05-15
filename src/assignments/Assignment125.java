package assignments;

import java.util.*;

public class Assignment125 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		int[] newArr = new int[size*2];
		newArr[size*2-1] = nums[size-1];
		//int[] newArr = Arrays.copyOf(nums, nums.length*2);
		System.out.println(Arrays.toString(newArr));
		
	}

}
