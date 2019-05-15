package day32_method04;

public class ArrayParameters {
	/*
	 * Method: Print Array
	 * Return Type: void
	 * Param: int[] nums
	 * print values of the nums array
	 */
	
	public static void main(String[] args) {
		int[] myArray = {44,22,66,11};
		printArray(myArray);
		printArray(new int[] {33,45,5,7});
	}
	
	public static void printArray(int[] nums) {
		for (int n: nums) {
			System.out.println(n + " ");
		}
		System.out.println();
	}
	
	/*
	 * print2Arrays
	 * return: void
	 * 
	 */
	//public static void print2Arrays()
			 
	
}
