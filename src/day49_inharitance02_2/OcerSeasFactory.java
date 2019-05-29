package day49_inharitance02_2;

import day49_inheritance02.Device;
//Non-sub class in different packages

public class OcerSeasFactory {
	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "Samsung";
		//dv.model = "3300"; it will work cause it is protected
		//dv.price = 1000; not visible
		//dv.country = "El Salvador";	not visible
		
	}

}
