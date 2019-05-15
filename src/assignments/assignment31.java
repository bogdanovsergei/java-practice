package assignments;
import java.util.*;
public class assignment31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of milligrams in drink:");
		int milligram = scan.nextInt();
		
		int drinks = (int)10000 / milligram;
		System.out.println("It would take about " + drinks + " drinks for a lethal overdose.");
	}

}
