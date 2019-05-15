package day27_arrays05;
import java.util.*;
public class tools {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		//System.out.println("Enter tool:");
		//String tool = scan.next();
		for (String tool: tools) {
			switch (tool.toLowerCase()) {
			case "java":
				System.out.println("Programming language");
				break;
			case "selenium":
				System.out.println("Test Automation");
				break;
			case "testNG":
			case "junit":
				System.out.println("Unit Tests");
				break;
			case "cucumber":
				System.out.println("BDD Style testing");
				break;
			case "git":
				System.out.println("Version control");
				break;
			case "maven":
				System.out.println("Building and execution for project");
				break;
			default:
				System.out.println("Invalid data");
			
			}
		}
	}

}
