package day38_arraylist03;
import java.util.*;
public class ContainsMethod {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList<String> list2 = list1;	// list 1, list2 point to the same object
		
		//copy all values from list1
		ArrayList<String> months = new ArrayList<>(list1);
		System.out.println(months);
		
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		
		System.out.println(months.contains("Jan"));
		
		System.out.println(months.indexOf("Feb")==1);		// the same checking
		System.out.println(months.get(1).equals("Feb"));	//
		
		ArrayList<String> months2 = new ArrayList<>(list1);
		System.out.println("Month: " + months.toString());
		System.out.println("Month2: " + months2.toString());
		
		//check if month has all the values of Month2
		if (months.containsAll(months2)) {
			System.out.println("Months has all values of Month2");
		} else {
			System.out.println("No");
		}
		
		months2.add("Jan");
		if (months.containsAll(months2)) {
			System.out.println("Months has all values of Month2");
		} else {
			System.out.println("No");
		}
		
	}

}
