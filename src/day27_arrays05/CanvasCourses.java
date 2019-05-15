package day27_arrays05;
import java.util.*;
public class CanvasCourses {
	public static void main(String[] args) {
		String url = "https://learn.cybertekschool.com/courses/149";
		
		String[] splitUrl = url.split("/");
		int courseID = Integer.parseInt(splitUrl[splitUrl.length-1]);
		
		switch (courseID) {
		case 147:
			System.out.println("Java programming");
			break;
		case 204:
			System.out.println("Mentoring sessions");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		default:
			System.out.println("Invalid data");
		}
			
	}

}
