package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		String[][] pizzas = {
			{"pineapple", "pepperoni"},
			{"anchovies", "mushroom", "olives"},
			{"4 cheese"},
			{"chicken", "tomatoes", "jalapenios", "onions"},
			{"green peppers", "zuccini", "brocolli", "spinach", "shrimp"}
		};
		
		//System.out.println(Arrays.toString(pizzas[0]));
		
		for (String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("###### FOR LOOP #######");
		for (int i=0; i<pizzas.length; i++) {
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		for (String topping: pizzas[4]) {
			System.out.println(topping);
		}
		
		
		int[][] students = {	{4,5,6}, 
								{12,5,7}, 
								{23,55,12,55,3}};
		
		//2 part: outer loop, inner loop
		//outer loop will take each group
		//inner loop will take each value/student id
		
		for (int[] group : students) {
			for (int studentId : group) {
				System.out.println(studentId);
			}
			System.out.println();
		}
		
		
		int[][] nums = {
				{10,20},
				{20,30,40,50},
				{100,200,400},
				{555,333,111,444,666,78}
		};
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
