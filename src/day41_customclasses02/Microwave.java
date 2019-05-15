package day41_customclasses02;

public class Microwave {
	String brand;
	boolean isOn;
	
	public void turnOn() {
		System.out.println("Turning ON the microwave");
		if (isOn == false) {
			isOn = true;
		} else {
			System.out.println(brand + " is already ON");
		}
	}

	public void turnOff() {
		System.out.println("Turning OFF the microwave");
		if (isOn) {
			isOn = false;
		} else {
			System.out.println(brand + " is already OFF");
		}
	}
	
	public void heat(String food) {
		if (isOn) {
			System.out.println("Heating " + food);
		} else {
			System.out.println("Microwave is OFF, cannot heat " + food);
		}
		
	}
}
