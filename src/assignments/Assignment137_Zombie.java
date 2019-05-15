package assignments;

import java.util.*;

public class Assignment137_Zombie {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		int zeros = 0;
		int day = 0;
		boolean exit = false;
		while (!exit) {
			if (day == 0) {
				System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			}

			day++;

			// working here
			
			int j = 0;
			int[] copyArr = Arrays.copyOf(inhabitants, 8);
			
			while (j < inhabitants.length) {
				if (inhabitants[j] == 0 && j == 0) {
					if (inhabitants[j + 1] / 2 == 0) {
						inhabitants[j + 1] = inhabitants[j + 1] / 2;
						j++;
					} else {
						inhabitants[j + 1] = inhabitants[j + 1] / 2;
					}
				} else if (inhabitants[j] == 0 && j != inhabitants.length - 1) {
					if (inhabitants[j-1] == copyArr[j-1]) {
						inhabitants[j-1] = inhabitants[j-1] / 2;
					}
					if (inhabitants[j + 1] / 2 == 0) {
						inhabitants[j + 1] = inhabitants[j + 1] / 2;
						j++;
					} else {
						inhabitants[j + 1] = inhabitants[j + 1] / 2;
					}
				} else if (inhabitants[j] == 0 && j == inhabitants.length - 1) {
					if (inhabitants[j-1] == copyArr[j-1]) {
						inhabitants[j-1] = inhabitants[j-1] / 2;
					}
				}
				j++;

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
