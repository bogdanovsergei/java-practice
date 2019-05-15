package day40_customclasses;

public class Employee {
	public String name;		//can be used anywhere in the project	
	public String jobTitle;
	double salary;			//can only be used in the same package
	
	public void work() {	//without public ==> you can use only in the same package
		System.out.println(name + " is working hard ...");
	}
	
	public void attandMeeting() {
		System.out.println(name + " is attending a meeting ...");
	}
	
	public void introduce() {
		System.out.println("Name[" + name + "], jobTitle[" + jobTitle + "], sallary[" + salary + "]");
	}

}
