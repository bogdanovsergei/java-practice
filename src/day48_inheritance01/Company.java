package day48_inheritance01;

public class Company {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "Marufjon";
		emp1.jobTitle = "teacher";
		emp1.gender = 'm';
		emp1.age = 22;
		
		Employee emp2 = new Employee();
		emp2.name = "Kiki";
		emp2.age = 26;
		emp2.gender = 'f';
		emp2.jobTitle = "HR";
		
		emp1.work();
		emp2.work();
		
		emp1.eat("chicken quesadillia");
		emp2.eat("salad");
		
		//System.out.println(emp1.hashCode());
		//System.out.println(emp2.hashCode());
		
		emp1.sleep(5);
		emp2.sleep(8);
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}

}
