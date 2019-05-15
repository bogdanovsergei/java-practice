package assignments;

import java.util.*;

public class Assignment83 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter guest name:");
		String list = input.next();
		String YesOrNo = "Yes";
		while (YesOrNo.equalsIgnoreCase("Yes")) {
			System.out.println("Do you want to enter new guest name:");
			YesOrNo = input.next();
			if (YesOrNo.equalsIgnoreCase("Yes")) {
				System.out.println("Please enter guest name:");
				String guest = input.next();
				list = list + ", " + guest;
			}
		}
		
		System.out.println("Guest's list: " + list);

	}

}
