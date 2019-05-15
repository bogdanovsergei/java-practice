package day39_arrayList04;

import java.util.*;

public class WarmUp {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		cities.add("Lima");

		for (String city : cities) {
			System.out.print(city + " | ");
		}
		System.out.println();

		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " | ");
		}
		System.out.println();

		System.out.println(cities.toString().toUpperCase());

		for (int i = 0; i < cities.size(); i++) {
			cities.set(i, cities.get(i).toUpperCase());
		}
		System.out.println(cities);

		// find longest city and shortest
		String longest = "", shortest = cities.get(0);
		for (String city : cities) {

			if (longest.length() < city.length()) {
				longest = city;
			}
			if (shortest.length() > city.length()) {
				shortest = city;
			}
		}
		System.out.println("Longest city: " + longest);
		System.out.println("Shortest city: " + shortest);

		List<String> citiesMoreThan6 = new ArrayList<>();
		
		// assign all cities that have more than 6 chars to this arraylist

		for (String city : cities) {
			if (city.length() > 6) {
				citiesMoreThan6.add(city);
			}
		}
		System.out.println(citiesMoreThan6);
	}

}
