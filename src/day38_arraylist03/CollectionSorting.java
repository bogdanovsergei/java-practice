package day38_arraylist03;
import java.util.*;
public class CollectionSorting {
	public static void main(String[] args) {
		List<Integer> numsList = new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		System.out.println(numsList);
		
		System.out.println("Sorting.");
		Collections.sort(numsList);
		System.out.println(numsList);
		
		List<String> strList = new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Maria");
		strList.add("Dina");
		strList.add("Bojan");
		
		Collections.sort(strList);
		System.out.println(strList);
		
		int maxNum = Collections.max(numsList);
		System.out.println(maxNum);
		
		String minName = Collections.min(strList);
		System.out.println(minName);
	}

}
