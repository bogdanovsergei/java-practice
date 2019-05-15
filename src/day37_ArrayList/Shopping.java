package day37_ArrayList;
import java.util.*;
public class Shopping {
	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		int count = shoppingList.size();
		System.out.println("Total count: "+count);
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0) + " | " + shoppingList.get(count-1));
		
		shoppingList.remove("paper towel");
		System.out.println(shoppingList.toString());
		
		for (String item: shoppingList) {
			System.out.println(item);
		}
		
		//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList);
		
		
		
	}
	

}
