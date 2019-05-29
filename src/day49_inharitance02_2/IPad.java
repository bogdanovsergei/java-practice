package day49_inharitance02_2;

import day49_inheritance02.Device;
//IPad IS-A Device
public class IPad extends Device{
	public void readEBook(String title) {
		System.out.println("Readinga book " + title + " using " + brand + " tablet");
		System.out.println("Model - " + model); // works cause it is protected
		//System.out.println("Price: " + price); will not work => not inherited
		
	}
}
