package day37_ArrayList;
import java.util.*;
public class MyCities {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		
		for (String city: cities) {			//using for each loop
			System.out.print(city + ", ");
		}
		
		System.out.println();
		
		for (int i=0; i<cities.size(); i++) {	//using for loop
			System.out.print(cities.get(i) + ", ");
		}
		System.out.println();
		
		//remove Baku
		cities.remove("Baku");
		System.out.println(cities.toString());
		
		//isEmpty?
		System.out.println("Is list empty?" + cities.isEmpty());
		
		//add to index
		cities.add(0, "Bishkek");
		System.out.println(cities.toString());
		
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());
		
		//replace item in certain index
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		int idx = cities.indexOf("Sterling");
		cities.set(idx, "Washington");
		System.out.println(cities.toString());
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("Is Empty: " + empty);
		
	}

}
