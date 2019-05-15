package day23_arrays;

public class PrintNumbersWithLoops {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for (int i=1; i<=10; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		for (int j=1; j<=2; j++) {				//outer loop
			for (int i=1; i<=10; i++) {			//inner loop
				System.out.print(i + ", ");
			}
			System.out.println();
		}
	}

}
