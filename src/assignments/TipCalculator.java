package assignments;
import java.util.*;

public class TipCalculator {
	public static void main(String[] args) {
		int numberOfPeople = 0;
		double 	checkAmount = 0, 
				totalTip = 0, 
				totalToPay = 0, 
				totalPerPerson = 0,
				tipPerPerson = 0;
		String 	serviceQuality = "", 
				split, 
				ampersand = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Split:");
		split = scan.next();
		
		if (split.equalsIgnoreCase("Yes")) {
			System.out.println("Number of people:");
			numberOfPeople = scan.nextInt();
			if (numberOfPeople>0) {
				if (numberOfPeople>10) {
					numberOfPeople = 10;
				}
			} else {
				System.out.println("Invalid number");
				return;
			}
			
			System.out.println("Check amount:");
			checkAmount = scan.nextFloat();
			System.out.println("Service Quality:"
							+ "\n\t-Poor"
							+ "\n\t-Fair"
							+ "\n\t-Good"
							+ "\n\t-Great"
							+ "\n\t-Exellent");
			
			while (serviceQuality == "") {
				
				serviceQuality = scan.next().toUpperCase();
				switch (serviceQuality) {
				case "POOR":
					totalTip = totalTip + checkAmount * 0.05;
					break;
				case "FAIR":
					totalTip = totalTip + checkAmount * 0.1;
					break;
				case "GOOD":
					totalTip = totalTip + checkAmount * 0.15;
					break;
				case "GREAT":
					totalTip = totalTip + checkAmount * 0.2;
					break;
				case "EXELLENT":
					totalTip = totalTip + checkAmount * 0.25;
					break;
				default:
					System.out.println("You need to choose one of the above  options. Try again.");
					serviceQuality = "";
				}
			} 
		} else {
				System.out.println("Ok. Have a good day!");
				return;
		}
		
			
		totalToPay = checkAmount + totalTip;
		totalPerPerson = totalPerPerson + totalToPay/numberOfPeople;
		tipPerPerson = tipPerPerson + totalTip/numberOfPeople;
		
		while (numberOfPeople > 0) {
			ampersand = ampersand + "&";
			numberOfPeople = numberOfPeople - 1;
			
		}
		
		System.out.println(	"Number of people entered: " + ampersand +
							"\nTotal to pay: " + String.format("%.2f", totalToPay) + 
							"\nTotal tip: " + String.format("%.2f", totalTip) + 
							"\nTotal per person: " + String.format("%.2f", totalPerPerson) + 
							"\nTip per person: " + String.format("%.2f", tipPerPerson));
			
			
		
	}

}
