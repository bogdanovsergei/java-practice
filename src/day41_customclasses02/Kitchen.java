package day41_customclasses02;

public class Kitchen {
	public static void main(String[] args) {
		Microwave test = new Microwave();
		
		test.brand = "LG";
		test.turnOn();
		test.heat("pizza");
		test.turnOff();
		
	}
}
