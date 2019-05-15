package day43_encapsulation_constractor;

public class TeslaDealer {
	public static void main(String[] args) {
		Tesla tesla = new Tesla();
		tesla.setModel("Model 3");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: " + tesla.getModel() + 
						"\nrange: " + tesla.getRange() + 
						"\nzero to 60: " + tesla.getZeroTo60() +
						"\nprice: " + tesla.getPrice() +
						"\nis selfDriving: " + tesla.isSelfDriving());
		
		System.out.println(tesla);	//automatically calling toString method
		System.out.println(tesla.toString());
		System.out.println(tesla.isValidModel("model 3"));
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		
		//check which one is faster
		if (tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());
		} else {
			System.out.println("Faster model: " + tesla.getModel());
		}
		
		// call buy
		buy(tesla);
		buy(myTesla);
		
		//call testDrive
		System.out.println(testDrive("Model S"));
		Tesla testCar = testDrive("Model 3");
		System.out.println(testCar.toString());
	}
	
	//method that return or accept custom type (Tesla)
	//in Tesla Dealer class
	// buy
	// Return type: void
	// param: Tesla car
	
	//	Purchasing + toString value
	
	public static void buy(Tesla car) {
		System.out.println("Purchasing: " + car.toString());
	}
	
	//testDrive
	//return: Tesla
	//param: String model
	//
	public static Tesla testDrive(String model) {
		System.out.println("- I would like to test drive - " + model);
		System.out.println("- Sure, let me build the object and return it");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
		return car;
	}
	

}
