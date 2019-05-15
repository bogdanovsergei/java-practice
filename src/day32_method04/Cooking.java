package day32_method04;

public class Cooking {
	public static void main(String[] args) {
		makePancakes();
		makePasta();
		cook("Omelette", "Eggs, Salt, Tomatoes, Green Pepper, Onions");
	}
	
	public static void cook(String dish, String ingredients) {
		System.out.println("--" + dish.toUpperCase() + " RECIPE --");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("==" + dish.toUpperCase() + " IS READY--");
		if (dish.equals("pancakes")) {
			makePancakes();
		}
	}
	
	public static void makePancakes() {
		System.out.println("--Pancakes Resipe--");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("--Enjoy your delicious pancakes--");
	}
	
	public static void makePasta() {
		System.out.println("--Italian Pasta Recipe--");
		add("Water, Salt, Olive oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmezan cheese, Marinara");
		System.out.println("--Delicious Pasta is Ready--");
	}

	public static void add(String ing) {
		// TODO Auto-generated method stub
		System.out.println("Add " + ing);
	}

	public static void mix(int second) {
		// TODO Auto-generated method stub
		System.out.println("Mix for " + second + " second");
	}

	public static void fry(int minutes) {
		System.out.println("Fry for " + minutes + " minutes");
	}

	public static void boil(int minutes) {
		System.out.println("Boil it for " + minutes + " minutes");
	}
}
