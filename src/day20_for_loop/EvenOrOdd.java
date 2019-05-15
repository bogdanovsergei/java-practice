package day20_for_loop;

public class EvenOrOdd {
	public static void main(String[] args) {
		//using for lopp: 1-100, print all even numbers in same line
		
		for (int n=1; n<=100; n++) {
			if (n%2==0) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
		// all odd numbers
		for (int i=1; i<=100; i++) {
			if (i%2!=0) {
				System.out.print(i + " ");
			}
		}
		
		//sumOdd, sumEven
		int sumEven = 0;
		for (int n=1; n<=100; n++) {
			if (n%2==0) {
				sumEven = sumEven + n;
			}
		}
		System.out.println();
		System.out.println(sumEven);
		
		int sumOdd = 0;
		for (int n=1; n<=100; n++) {
			if (n%2==0) {
				sumOdd = sumEven + n;
			}
		}
		System.out.println(sumOdd);
		
	}

}
