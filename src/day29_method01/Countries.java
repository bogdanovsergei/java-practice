package day29_method01;

import java.util.*;

public class Countries {
	public static void main(String[] args) {
		
		String[][] countries = {
				{"USA" , "Washington DC"},
				{"Canada", "Ottawa"},
				{"Mexico", "Mexico city"},
				{"Brasil", "Brasilia"},
				{"Peru", "Lima"},
				{"Argentina", "Boanes Aeros"},
				{"Bolivia", "La Paz"},
				{"Macedonia", "Scopia"},
				{"Kazakhstan", "Nursultan"}
		};
		System.out.println(countries[0][0] + " | " + countries[0][1]);
		System.out.println(Arrays.deepToString(countries));
		
		for (int i=0; i<countries.length; i++) {
			System.out.print(countries[i][0] + "|");
		}
		System.out.println();
		//for each loop
		for (String[] country: countries) {
			System.out.print(country[0] + "|");
		}
		System.out.println();
		// get all the cities and add to cities[] array
		
		String[] cities = new String[countries.length];
		for (int j=0; j<countries.length; j++) {
			cities[j] = countries[j][1];
		}
		System.out.println(Arrays.toString(cities));
		
		//look for Bolivia in the array and test if the capital is "La Paz"
		
		for (int i=0; i<countries.length; i++) {
			if (countries[i][0] == "Bolivia") {
				//if we put break here ==> unreachable code
				if (countries[i][1] == "La Paz") {
					System.out.println("Bolivia test passed");
				} else {
					System.out.println("Bolivia test failed");
				}
				break; // exit the loop
			}
		}

	}

}
