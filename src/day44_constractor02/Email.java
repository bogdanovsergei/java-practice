package day44_constractor02;

public class Email {
	
	String message;
	
	public Email(String message) {
		System.out.println("Sending email with message: " + message);
		this.message = message;
	}

}
