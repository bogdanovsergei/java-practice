package assignments;
import java.util.*;
public class Assignment124 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		//WRITE YOUR CODE HERE
		if (num.length <= 2) {
		  System.out.println(Arrays.toString(num));
		} else {
		  int[] twoNums = Arrays.copyOf(num, 2);
		  System.out.println(Arrays.toString(twoNums));
		}
	}

}
