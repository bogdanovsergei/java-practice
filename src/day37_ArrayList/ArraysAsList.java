package day37_ArrayList;
import java.util.*;
public class ArraysAsList {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		cars.add("Honda");
		
		//declare and add values in single statement
		//Arrays class
		List<Integer> nums = Arrays.asList(4,2,5,7,8);
		
		System.out.println(nums.size());
		//nums.add(100);					you cannot to add or remove, cause size is fixed
		//System.out.println(nums.size());	it is not resizable
		
		List<Double> prices = Arrays.asList(12.4, 5.3, 500.0, 1230.50, 5.99, 
											12.0, 9874.44, 34.4, 123.5, 7.3);
		
		System.out.println(prices);
		
		//calculate sum of all
		double sum = 0;
		
		for(double price: prices) {
			sum += price;
		}
		System.out.printf("Sum: "+"%.2f",sum);
		System.out.println();
		
		//using for loop
		double sum2 = 0;
		for (int i=0; i<prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.printf("Sum: " + "%.2f",sum2);
		System.out.println();
		
		//create new list expensive
		//add prices that are more than 100
		
		List<Double> expensive = new ArrayList<>();
		
		for(double price: prices) {
			if (price>100.0) {
				expensive.add(price);
			}
		}
		System.out.println(expensive);
		
		//prices.removeAll(expensive);
		//System.out.println(prices.toString());
		
		
	}

}
