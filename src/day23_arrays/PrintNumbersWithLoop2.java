package day23_arrays;

public class PrintNumbersWithLoop2 {
	public static void main(String[] args) {
		for (int j=1; j <=10; j++) {
			for (int i=1; i<=j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		//reverse
		
		for (int j=10; j>=1; j--) {
			for (int i=1; i<=j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
