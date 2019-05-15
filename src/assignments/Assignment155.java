package assignments;

import java.util.*;

public class Assignment155 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num) {
		// WRITE YOUR CODE HERE
		int[] fib = new int[num];
		fib[0] = 1;
		fib[1] = 1;
		if (num == 2 || num == 1) {
			System.out.println(fib[1]);
		} else {
			for (int i = 2; i < num; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
			System.out.println(fib[num - 1]);
		}
		
	}
}
