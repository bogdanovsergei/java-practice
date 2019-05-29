package day46_static_keyword;

public class Dinner {
	public static int pizzaSlices = 8;	//static => we have access through classname, without creating object
	
	public void takeASlice() {
		pizzaSlices--;
	}
	
	public void takeASlice(int count) {
		pizzaSlices -= count;
	}
	
	

}
