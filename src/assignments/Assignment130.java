package assignments;

import java.util.*;

public class Assignment130 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] score = new float[7];
		// WRITE YOUR CODE HERE
		for (int j = 0; j < 7; j++) {
			System.out.println("Enter score for judge " + (j + 1) + ":");
			score[j] = input.nextFloat();
		}
		System.out.println("Enter difficulty:");
		float dif = input.nextFloat();
		
		
		Arrays.sort(score);
		float sum = 0;
		for (int i = 1; i < score.length - 1; i++) {
			sum += score[i];
		}
		
		float total = sum * dif;

		// FINAL OUTPUT
		System.out.printf("Total: %.2f", total);

	}

}
