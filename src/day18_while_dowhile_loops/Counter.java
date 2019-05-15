package day18_while_dowhile_loops;

public class Counter {
	public static void main(String[] args) throws InterruptedException {
		int num =1;
		
		while (num<=10) {
			System.out.print(num + ", ");
			num++;
			Thread.sleep(500); // pause the code execution for a second
		}
		System.out.println("Num value after loop:" + num);
		
		int num2 = 11;
		while (num2>0) {
			System.out.print(num2 + ", ");
			num2--;
		}
		System.out.println("\nNum2: " + num2);
		
		
	}

}
