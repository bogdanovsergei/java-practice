package day28_multid_arrays;

import java.io.IOException;
import java.nio.*; // 1 step
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		// read all data and assign to String array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]); // 2 step.
		// 2 step: Files is method. (provide path to file) ==> convert to Array ==>
		// index 0 might be different(1 for ex)
		// 3 step: rigth click "Add declaration"
		System.out.println("Data size: " + data.length);

		// print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
		// print last restaurant
		System.out.println(data[data.length - 1]);

		// print each restaurant information in separate line
		int counter = 0;
		for (String restaurant : data) {
			System.out.println("#" + counter + "=>" + restaurant);
			counter++;
		}

		// print all restaurants information in state of VA. Also count it and print

		int countVA = 0;
		for (String row : data) {
			if (row.contains(",VA,")) {
				System.out.println("#" + countVA + "=>" + row);
				countVA++;
			}
		}
		System.out.println("### TOtal restaurants in VA: " + countVA);

		// find all restaurants information in state of VA.
		// print the restaurant names along with cityname
		// Subway - Herndon

		countVA = 0;
		for (String row : data) {
			if (row.contains(",VA,")) {
				String[] arr = row.split(",");
				System.out.println(countVA + ". " + arr[2] + " - " + arr[1]);
				countVA++;
			}
		}

	}

}
