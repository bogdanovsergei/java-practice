package day34_method06;

import java.util.Arrays;

public class VarArgs {
	public static void main(String... args) {
		printWords("red", "blue");
		printWords("grey");
		printWords();	//array will be empty
		String[] myPets = {"cat", "dog", "horse", "sheep", "goat"};
		printWords(myPets);
		
		System.out.println(sum(1,2,3,4));
		
		int budget = 200;
		if (sum(10,45,110,30) <= budget) {
			System.out.println("Within budget");
		} else {
			System.out.println("Broke");
		}
		
		int total = sum(123,232,12,32,23);
		System.out.println("Total: "+total);
		
		cook("Burrito Bowl", "Rice", "Beans", "Meat", "Sour Cream");
		shoppingList(1000, "Avocado Toast", "Watch", "Smthng");
	}
	
	public static void printWords(String... words) {
		// handle it like an array
		for (String w: words) {
			System.out.println(w);
		}
	}
	
	public static int sum(int... nums) {
		int sum =0;
		for (int num: nums) {
			sum +=num;
		}
		return sum;
	}
	
	public static void cook(String name, String... ings) {
		System.out.println("Food: " + name);
		System.out.println(Arrays.toString(ings));
	}
	
	public static void shoppingList(int totalPrice, String... items) {
		System.out.println("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	}

}
