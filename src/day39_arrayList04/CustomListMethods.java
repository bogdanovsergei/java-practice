package day39_arrayList04;

import java.util.*;

public class CustomListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		printList(numsList);
		System.out.println();

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.80);

		System.out.println("Sum of doubles : " + sumList(doubleList));

		System.out.println(getList(10));
		System.out.println(getList(10).contains(5));
		//for (;;) {
			System.out.println(getRandomList(20));
		//}
		List<Integer> rList = getRandomList(20);
		Collections.sort(rList);
		System.out.println(rList);
		
		printList(getRandomList(5));
		System.out.println();
		//=======convert to Int
		List<String> strL = new ArrayList<>();
		strL.add("56");
		strL.add("99");
		System.out.println(convertToIntList(strL));
	}

	public static void printList(List<Integer> nums) {
		for (Integer i : nums) {
			System.out.print(i + " ");
		}
	}

	public static double sumList(List<Double> dList) { // public static Double sumList(List<Double> dList)
		double sum = 0.0; // can be. doesnt matter
		for (Double i : dList) {
			sum += i;
		}
		return sum;
	}

	// return type: ArrayList<Integer>
	// params: int size
	// getList(5) ==> [1,2,3,4,5]

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int j = 1; j <= size; j++) {
			newList.add(j);
		}
		return newList;
	}

	// getRandomList

	public static List<Integer> getRandomList(int size) {
		Random r = new Random();
		List<Integer> randList = new ArrayList<>();
		for (int k = 0; k <= size; k++) {
			randList.add(r.nextInt(101));
		}
		return randList;
	}

	// convert to IntList
	// Return type: List<Integer>
	// param: List<String>
	// it will take string, convert it to Int

	public static List<Integer> convertToIntList(List<String> strL) {
		List<Integer> nums = new ArrayList<>();
		for (String str : strL) {
			nums.add(Integer.parseInt(str));
		}
		return nums;
	}

}
