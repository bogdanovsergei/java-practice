package assignments;

import java.util.*;

public class Assignment121 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] arr = str.split(", ");
		String shortest = arr[0];
		String shorts = arr[0] + ", ";

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() == shortest.length()) {
				shorts += arr[i] + ", ";
			} else if (arr[i].length() < shortest.length()) {
				shortest = arr[i];
				shorts = arr[i] + ", ";
			}
		}

		String[] arrShorts = shorts.split(", ");
		Arrays.sort(arrShorts);
		System.out.println(Arrays.toString(arrShorts));

	}

}
