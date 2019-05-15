package day27_arrays05;
import java.util.Arrays;
public class ArraysClass {
	public static void main(String[] args) {
		int [] nums = {43, 12, 4, 1, 3, 5};
		
		//toString method
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//sort method. Sort array in ascending order
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish"};
		System.out.println(Arrays.deepToString(languages));
		
		Arrays.sort(languages);
		System.out.println(Arrays.deepToString(languages));
		
		int[] num2 = {345, 665, 3333, 11, 3, 66};
		
		//find a lowest and largest values from nums2 array
		
		Arrays.sort(num2);
		int lowest = num2[0];
		int largest = num2[5];
		System.out.println("Lowest number is " + lowest);
		System.out.println("Largest number is " + largest);
		
		//BINARY Search
		int nums3[] = {4, 10, 20, 50};
		Arrays.binarySearch(nums3, 10);
		
	}

}
