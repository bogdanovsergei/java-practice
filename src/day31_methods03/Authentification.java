package day31_methods03;
import java.util.*;
public class Authentification {
	/*
	 * Name: Login
	 * Return type: void
	 * 2 String args/params: username, password
	 * Inside the method
	 * validname =  "mentoring@dybertekschool.com"
	 * validpassword = "Mentor001"
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Username:");
		String userName = scan.next();
		System.out.println("Password:");
		String password = scan.next();
	
		Login(userName, password);
	}
	
	public static void Login(String userName, String password) {
		String validUser = "mentoring@dybertekschool.com";
		String validPassword = "mentor001";
		if (userName.equals(validUser) && password.equals(validPassword)) {
			System.out.println("Login Successful! Welcome to Okta!");
		} else {
			System.out.println("Sign in failed!");
		}
		
	}

}
