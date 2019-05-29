package day51_inheritance04;

public class Snowboarding extends Exercise{
	
	public int perform(int minutes) {
		int cal = super.perform(10);	// call parent class method or variable
		System.out.println("Snowboarding for " + minutes + " minutes");
		return minutes * 7 + cal;
	}

}
