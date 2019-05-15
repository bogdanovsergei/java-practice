package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
		String companyName = "Facebook";
		String address = "Silicon Valley, CA";
		int numberOfEmployees = 10234;
		long revenue = 5000234123L;
		boolean isTechCompany = true;

		System.out.println("Company name is "+ companyName);
		System.out.println("Address is " + address);
		System.out.println("Number of employees is " +numberOfEmployees);
		System.out.println("Annual revenue is " + revenue);
		System.out.println("Is it a tech company? - " + isTechCompany);

		//System.out.println(revenue + isTechCompany); will not work
		//System.out.println(companyName + numberOfEmployees);
		System.out.println();
		System.out.println();
		String aboutCompany = "Company "+companyName+" is located in "+address
				+ "\n \t and "+numberOfEmployees + " work for it.";

		System.out.println(aboutCompany);
	}

}
