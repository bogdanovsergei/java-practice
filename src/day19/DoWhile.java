package day19;

public class DoWhile {
	public static void main(String[] args) {
		
		//print 1 to 10 using do while loop
		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		
		// sum 1 to 5
		int sum = 0;
		int j =0;
		do {
			sum = sum + j;
			j++;
		} while (j<=5);
		
		System.out.println("Sum from 1 to 5 is " + sum);
	}

}
