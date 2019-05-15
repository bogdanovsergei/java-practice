package day42_customclasses_encapsulation;

import java.util.Arrays;

public class Burger7 {
	public static void main(String[] args) {
		Burger burger1 = new Burger();
		burger1.name = "COWBOY";
		String[] ings = {"onion crisps", "american cheese", 
                		"pickles", "lettuce", "b7 sauce"};
		
		burger1.ingridients = ings;
		
		System.out.println(burger1.name);
		System.out.println(Arrays.toString(burger1.ingridients));
		System.out.println(burger1.ingridients[0]);
		
		//print all ings using a loop
		
		for(String ing: burger1.ingridients) {
			System.out.println(ing);
		}
	}

}
