package day38_arraylist03;

import java.util.*;

public class MethodsSummary {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		//add method to add a value
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		
		//add method with index
		list1.add(0,"yellow");
		
		System.out.println(list1.toString());
		//size method
		System.out.println("Number of elements: " + list1.size());
		
		//get method
		System.out.println("3: " + list1.get(3));
		
		//remove using index
		list1.remove(0);
		System.out.println(list1);
		
		//remove using value // first occurence
		list1.remove("blue");
		System.out.println(list1);
		
		//set method ==> replace certain index with new value
		list1.set(0, "orange");
		System.out.println(list1);
		
		//indexOf(value)
		System.out.println("Grey: " + list1.indexOf("grey"));
		System.out.println("Grey: " + list1.indexOf("green"));	// if it is not there returns -1
		
		//isEmpty() ==> returns true if list is empty// size ==0
		System.out.println("Is list empty?: " + list1.isEmpty());
		System.out.println("Is list empty?: " + (list1.size()==0));
		
		//contains(elem)
		System.out.println("white n list?: " + list1.contains("white"));
		
		List<String> list2 = new ArrayList<>();
		
		//addAll(list)
		list2.addAll(list1);
		System.out.println("list2: "+list2);
		
		//containsAll(list) ==> check if list has all values of another list
		System.out.println("contains all?:" + list1.containsAll(list2));
		
		//equals(list) method ==> check if two list are exactly equal
		System.out.println("Equals?: " + list1.equals(list2));
		
		list2.add("pink");
		//removeAll(list) ==> removes all matching values from list that are in other list
		list2.removeAll(list1);
		System.out.println("list2 after removeAll: "+list2);
		System.out.println("list1: " + list1);
		
		//addAll(index, list)
		list2.addAll(0,list1);
		System.out.println(list2);
		
		//clear() removes all values
		list1.clear();
		list2.clear();
	}
}
