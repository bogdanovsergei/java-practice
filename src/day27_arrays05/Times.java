package day27_arrays05;

import java.util.*;

public class Times {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hours = 0;
		int minutes = 0;
		int[] time1 = new int[2];
		int[] time2 = new int[2];

		System.out.println("Enter time1:");
		time1[0] = scan.nextInt();
		time1[1] = scan.nextInt();

		System.out.println("Enter time2:");
		time2[0] = scan.nextInt();
		time2[1] = scan.nextInt();

		// check valid range
		// time1
		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time has invalid hour");
			return;
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time has invalid minute");
			return;
		}
		// time2
		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time has invalid hour");
			return;
		}
		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time has invalid minute");
			return;
		}

		if (time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		} else if (time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		} else {
			if (time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			} else if (time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			} else {
				System.out.println("Time1 and time2 are equal");
			}
		}

	}

}
