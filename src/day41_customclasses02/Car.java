package day41_customclasses02;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;
	
	public void printCarInfo() {
		System.out.println("car make[" + make + "], model[" + model + "], color[" + color + "], currentSpeed[" + currentSpeed + "]");
	}

	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed <= speedLimit) {
			System.out.println(make + " is driving at "+ currentSpeed +" mph, following speed limit - " + speedLimit);
		} else {
			System.out.println(make + " is driving at "+ currentSpeed +" mph, over the speed limit - " + speedLimit);
		}
	}
	
	public void drive() {
		System.out.println(make + " is driving...");
	}
	
	public void accellerate(int increase) {
		currentSpeed += increase;
	}
}
