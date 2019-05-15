package assignments;

import java.util.*;

public class Assignment122 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.
		int zeros = 0;
		int day = 0;
		boolean exit = false;
		while (!exit) {
			if (day == 0) {
				System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			}
			
			day++;
			
			for (int i = 0; i < inhabitants.length; i++) {
				inhabitants[i] = inhabitants[i] / 2;
			}
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			
			
			for (int k = 0; k < inhabitants.length; k++) {
				if (inhabitants[k] == 0) {
					zeros++;
				}
			}
			
			if (zeros == inhabitants.length) {
				exit = true;
				System.out.println("---- EXTINCT ----");
			} else {
				zeros = 0;
			}
		}

	}
}
