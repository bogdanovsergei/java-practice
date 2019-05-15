package day40_customclasses;

public class Contact {
	
	//instance variables:
	String name;
	String phoneNumber;
	String email;
	
	// behavior | instance methods:
	public void call() {			// we dont need input, cause we are already inside the class
		System.out.println("Calling " + name + ".....");
	}
	
	public void sendMessage() {
		System.out.println("Sending message to " +phoneNumber+ " | name: "+ name + ".....");
	}
	
	public void sendEmail() {
		System.out.println("Sending email to " + email);
	}

}
