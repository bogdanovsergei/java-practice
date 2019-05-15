package PracticeWithVasil;
import java. util.*;
public class TernaryOperator {
	public static void main(String[] args) {
		int time = 20;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter score:");
		int score = scan.nextInt();
		System.out.println(score>=64?"Passed": score<0 ? "Invalid Data": "");
		
	}

}
