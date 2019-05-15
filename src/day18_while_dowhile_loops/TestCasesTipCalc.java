package day18_while_dowhile_loops;
import java.util.*;
public class TestCasesTipCalc{

	public static void main(String[] args) {
		int numberOfPeople, tipPercent;
		double billAmount, tipPerPerson, totalPerPerson, totalAmount, totalTips;
		boolean isSplit;
		String tips, split, quality;
		Scanner scan = new Scanner(System.in);
		
		totalAmount = 0.0;
		System.out.println("Split or No split? Yes/No");
		split = scan.next().toLowerCase();
		//isSplit = scan.nextBoolean();
		switch (split)
		{
			case "yes": 
				isSplit = true;
				break;
			case "no":
				isSplit = false;
				break;
			default: 
				System.out.println("Invalid answer!!! Please try again");
				return;
		}
		
		System.out.println("Enter number of people:");
		numberOfPeople = scan.nextInt();
		
		System.out.println("Service quality?");
		quality = scan.next().toLowerCase();
		switch (quality) 
		{
			case "poor":
				tipPercent = 5;
				break;
			case "fair":
				tipPercent = 10;
				break;
			case "good":
				tipPercent = 15;
				break;
			case "great":
				tipPercent = 20;
				break;
			case "excellent":
				tipPercent = 25;
				break;
			default:
				System.out.println("Invalid input, please try again!");
				return;
				
		}
		
		System.out.println("Total to pay:");
		billAmount = scan.nextDouble();
		
		totalAmount = billAmount + billAmount * tipPercent / 100;
		totalTips = billAmount * tipPercent / 100;
		
		if (isSplit) 
		{
			totalPerPerson = totalAmount / numberOfPeople;
			tipPerPerson = totalTips / numberOfPeople;
			System.out.println("Split: Yes");
			System.out.println("Number of people entered: &&&&");
			System.out.printf("Total to pay: " + "%.2f",totalAmount);
			System.out.printf("\nTotal tip: " + "%.2f",totalTips);
			System.out.printf("\nTotal per person: " + "%.2f",totalPerPerson);
			System.out.printf("\nTip per person: " + "%.2f",tipPerPerson);
		} else 
		{
			System.out.println("Split: No");
			System.out.println("Number of people entered: &&&&");
			System.out.printf("Total to pay: " + "%.2f",totalAmount);
			System.out.printf("\nTotal tip: " + "%.2f",totalTips);
			System.out.printf("\nTotal per person: " + "%.2f",totalAmount);
			System.out.printf("\nTip per person: " + "%.2f",totalTips);
			
		}
	}

}
