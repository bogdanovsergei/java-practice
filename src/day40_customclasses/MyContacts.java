package day40_customclasses;

public class MyContacts {
	public static void main(String[] args) {
		Contact evgenia = new Contact();
		
		evgenia.name = "Evgenia Javilova";
		evgenia.phoneNumber = "(202)333-4444";
		evgenia.email = "evgenia@thorlabs.com";
		
		evgenia.call();
		evgenia.sendMessage();
		evgenia.sendEmail();
		
		Contact orhan = new Contact();
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "(571)991-3322";
		orhan.email = "orhan@google.com";
		
		System.out.println("Name: " + orhan.name);
		System.out.println("PhoneNumber: " + orhan.phoneNumber);
		System.out.println("Email: " + orhan.email);
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
	}

}
