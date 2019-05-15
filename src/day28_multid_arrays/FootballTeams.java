package day28_multid_arrays;

import java.util.Arrays;

public class FootballTeams {
	public static void main(String[] args) {
		//declare MultiD array 
		String[][] teams = new String [2][6];  //String[] teams[]
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";
		
		System.out.println("First playerof first team: " + teams[0][0]);
		System.out.println(teams[1][5]);
		System.out.println("Number of rows: " + teams.length);
		System.out.println("People of first team: " + teams[0].length);
		System.out.println(Arrays.deepToString(teams));					// to print multiD Array
		
		int[][] nums = {	{100, 1500, 1234, 15434},
							{256, 21237, 21223, 212375,},
							{313, 31235, 37567, 3645}};
		
		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[0]));

		int[][] scores = { {3,5,10}, {6,4,2,10} };
		System.out.println("Days played/Number of arrays:" + scores.length);
		System.out.println("Number of values in 1: " + scores[0].length);
		System.out.println("Number of values in 2: " + scores[1].length);
		
		
		int [][] values = new int[4][]; // we reserved 4 spots but don't know how many sets are there...we can skip second declare
		values[0] = new int[] {123,123,32};
		values[1] = new int[] {23,1,23,234,234,234,2,34,23,25};
		values[2] = new int[2];
		
		values[2][0] = 55;
		values[2][1] = 88;
		values[3] = new int[] {5,34,24,66,23};
		
		System.out.println(Arrays.deepToString(values));
		
		
	}

}
