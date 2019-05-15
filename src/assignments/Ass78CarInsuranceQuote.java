package assignments;

import java.util.*;

public class Ass78CarInsuranceQuote {
	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");

		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		String driverLisence = scan.next();
		if (driverLisence.equalsIgnoreCase("No")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}

		System.out.println("Enter your zip code");
		int zipcode = scan.nextInt();
		if (zipcode == 20910 || zipcode == 20740) {
			premium = premium + 60;
		} else if (zipcode == 22102 || zipcode == 22103) {
			premium = premium + 30;
		} else {
			premium = premium + 50;
		}

		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();
		if (vehicleOwnership.equalsIgnoreCase("Owned")) {
			premium = premium + 10;
		} else if (vehicleOwnership.equalsIgnoreCase("Financed") || vehicleOwnership.equalsIgnoreCase("Leased")) {
			premium = premium + 20;
		} else {
			System.out.println("Invalid data!");
			System.exit(0);
		}

		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		if (vehicleUsage.equalsIgnoreCase("Business")) {
			premium = premium + 50;
		} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
			premium = premium + 10;
		} else if (vehicleUsage.equalsIgnoreCase("Commute")) {
			premium = premium + 20;
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			while (daysDrivenToWorkOrSchool > 0) {
				premium = premium + 5;
				daysDrivenToWorkOrSchool--;
			}
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			while (milesToWorkOrSchool > 0) {
				premium = premium + 1;
				milesToWorkOrSchool--;
			}
		} else {
			System.out.println("Invalid data!");
			System.exit(0);
		}

		System.out.println("How old are you?");
		int age = scan.nextInt();
		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (age>16 && age<18) {
			premium = premium*20;
		} else if (age>=18 && age <=21) {
			premium = premium*6;
		} else if (age >21 && age <25) {
			premium = premium*2;
		}
		
		System.out.println("How many years you've been driving?");
		int drivingYear = scan.nextInt();
		if (drivingYear>0 && (age-drivingYear) >=16) {
			while (drivingYear > 0) {
				premium = premium -5;
				drivingYear--;
			}
		}
		
		System.out.println("Have you had any accidents in the last 5 years?");
		String answer = scan.next();
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("How many?");
			int amountOfAccidents = scan.nextInt();
			premium = premium + amountOfAccidents*premium * 0.2;
		}
		
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();
		if (continuousInsurance.equalsIgnoreCase("No")) {
			premium = premium*2;
		}
		
		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine()+scan.nextLine();
		if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
			premium = premium - premium*0.05;
		} else if (education.equalsIgnoreCase("Doctors")) {
			premium = premium - premium*0.1;
		} else if (education.equalsIgnoreCase("Less than High School")) {
			premium = premium + premium*0.05;
		}
		
		
		referenceNumber = name.substring(0,2).toUpperCase() + 
				Integer.toString(age) + 
				name.substring(name.length()-2, name.length()).toUpperCase() + 
				Integer.toString(zipcode) +
				education.replace(" ", "").toUpperCase();
		
		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		System.out.println("Reference number: " + referenceNumber);

	}

}
