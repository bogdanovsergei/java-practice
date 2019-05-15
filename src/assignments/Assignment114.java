package assignments;

import java.util.*;

public class Assignment114 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

		int index = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count==1) {
				index = i;
			}
			
		}
		System.out.println(nums[index]);
	}

}
// [1, 1, 2, 3, 4, 3, 4]
// [1, 1, 2, 3, 4, 3, 4]