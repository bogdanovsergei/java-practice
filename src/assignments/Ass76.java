package assignments;

import java.util.*;

public class Ass76 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String 	start = scan.next(), 
				end = scan.next();
		if (start.equalsIgnoreCase(end)) {
			System.out.println(end + " found");
		} else {
			while (!(start.equalsIgnoreCase(end))) {
				if (start.equalsIgnoreCase("A")) {
					System.out.print("right");
					start = "B";
				} else if (start.equalsIgnoreCase("B")) {
					System.out.print("down");
					start = "C";
				} else if (start.equalsIgnoreCase("C")) {
					System.out.print("left");
					start = "D";
				} else if (start.equalsIgnoreCase("D")) {
					System.out.print("up");
					start = "A";
				}
				
				if (start.equalsIgnoreCase(end)) {
					System.out.print(": " + end + " found");
				} else {
					System.out.print(" > ");
				}

			}
		}

	}

}
