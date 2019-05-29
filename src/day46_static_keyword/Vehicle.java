package day46_static_keyword;

public class Vehicle {
	String type;	//non-static// instance var, every object has its own type
	static int numberOfVehicles;	// shared, one central value
	
	public static void vehicleInfo() {
		//System.out.println("Type: " + type);	==> will not compile. Type is non-static
		System.out.println("numberOfVehicle: " + numberOfVehicles);
		int count = getNumberOfVehicle();
		String make = "Kia";
		make = make.toUpperCase();
		System.out.println("Make: " + make);
		
		//System.out.println(toString()); ==> cannot call non-static method
	}
	
	public static int getNumberOfVehicle() {
		return numberOfVehicles;
	}
	
	public String toString() {
		return "Vehicle type: " + type + " | count: " +numberOfVehicles;
	}
	
	

}
