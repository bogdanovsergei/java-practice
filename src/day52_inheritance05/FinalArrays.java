package day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		final int[] TEAMS = new int[]{11, 11};
		System.out.println("Team1: " + TEAMS[0]);
		System.out.println("Team2: " + TEAMS[1]);
		
		TEAMS[0] = 10;
		TEAMS[1] = 9;
		
		System.out.println("Team1: " + TEAMS[0]);
		System.out.println("Team2: " + TEAMS[1]);
		
		//TEAMS = new int[3];	it is not possible
		//TEAMS = new int[] {10, 10, 10}		
		//You cannot reassign array. But values can be changed.
		
		//for example 
		int[] nums = new int[] {23,55,1231};
		System.out.println(Arrays.toString(nums));
		nums = new int[] {123,123,123,123};
		System.out.println(Arrays.toString(nums));
		
		final int[] finalNums = {23, 66, 44, 11};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 34234;
		System.out.println(Arrays.toString(finalNums));
		
		
		final double[] PRICES = new double[3];
		PRICES[0] = 34.4;
		PRICES[1] = 12.5;
		PRICES[2] = 65.6;
		System.out.println(Arrays.toString(PRICES));
		PRICES[0] = 81.1;
		System.out.println(Arrays.toString(PRICES));
		
		//PRICES = new double[3]	// not possible
		
		
		
		
	}

}
