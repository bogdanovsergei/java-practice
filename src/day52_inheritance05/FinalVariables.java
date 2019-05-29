package day52_inheritance05;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE =610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	public final String JAN = "January";
	
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "admin@gmail.com";
	}
	
	public FinalVariables() {
		MODEL_3_MAX_SPEED = 180;
	}
	/*
	public FinalVariables(int num) {
		MODEL_3_MAX_SPEED = num;
	}
	*/
	
	{
		MODEL_X_PASSENGERS = 7;
	}
	
	
	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT = 5;	//CONSTANT
		//MAX_PASSENGERS_COUNT = 10;	cannot be changed after initial assignments
		System.out.println(MAX_PASSENGERS_COUNT);
		
		final int SSN;
		SSN = 321432123;
		
		FinalVariables finalVars = new FinalVariables();
		System.out.println("Max range fo roadster: "+finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: "+finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Number fo passengers: "+finalVars.MODEL_X_PASSENGERS);
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		
		System.out.println("Company name: " + COMPANY_NAME);
		System.out.println("Company name: " + FinalVariables.COMPANY_NAME);
		System.out.println("Admin: " + ADMIN_USERNAME);
		
	}

}
