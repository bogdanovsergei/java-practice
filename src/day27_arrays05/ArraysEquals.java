package day27_arrays05;
import java.util.*;
public class ArraysEquals {
	public static void main(String[] args) {
		int[] nums1 = {4,5,6,10,100};
		int[] nums2 = {4,5,6,10,100};
		System.out.println(Arrays.equals(nums1, nums2));
		if (Arrays.equals(nums1, nums2)) {
			System.out.println("They are exactly same");
		} else {
			System.out.println("Mismatched values present");
		}
		
		String[] strArr1 = {"one", "two", "three"};
		String[] strArr2 = {"One", "Two", "Three"};
		System.out.println(Arrays.equals(strArr1, strArr2));
		
		boolean match = Arrays.equals(strArr1, strArr2);
		System.out.println("Match: " + match);
	}

}
