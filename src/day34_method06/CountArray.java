package day34_method06;

import java.util.Random;

public class CountArray {
	public static void main(String[] args) {
		int[] nums = {2,3,4,5,5,6,6,6,7,5,5,12};
		//1. print return rigth away
		System.out.println(findOccurences(nums, 5));
		//2. assign return value into a variable
		int fives = findOccurences(nums, 5);
		int sixes = findOccurences(nums, 6);
		System.out.println(fives);
	}
	
	public static int findOccurences (int[] arr, int value) {
		int count=0;
		for (int item: arr) {
			if (value == item) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] getArray () {
		int[] retArray = {45,43,11,545,1000};
		return retArray;
	}
	
	public static int[] getRandomArray(int size) {
		Random random = new Random();
		int[] nums = new int[size];
		for (int i=0; i<size; i++) {
			nums[i] = random.nextInt(1000);
		}
		return nums;
	}
}
