package day25_arrays03;
import java.util.*;
public class Population {
	public static void main(String[] args) {
		int[] population = new int[5];
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[3] = 8907;
		population[4] = 4455;
		
		System.out.println(population[0]);
		
		String str = "abc";
		System.out.println(population[str.length()]);
		
		//String array called cities
		
		String[] cities = {"Miami", "London", "Tokio", "Rome", "New York"};
		
		for (int i=0; i<5; i++) {
			System.out.println("Population of " + cities[i] + " is " + population[i]);
		}
	}

}
