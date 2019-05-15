package day41_customclasses02;

public class MyCars {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Chevy";
		car1.model = "Cruze";
		car1.color = "red";
		car1.currentSpeed = 90;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(80);
		car1.showCurrentSpeed(100);
		car1.drive();
		
		System.out.println("before: "+car1.currentSpeed);
		car1.accellerate(10);
		System.out.println("after: "+car1.currentSpeed);
		
		//===========================
		
		BMW bmw = new BMW();
		System.out.println(bmw.make);
		bmw.model = "m3";
		bmw.showPrice();
		
		System.out.println("Price: " + bmw.price);
		
		BMW bmw2 = new BMW();
		bmw2.model = "X3";
		bmw2.showPrice();
		
	}

}
