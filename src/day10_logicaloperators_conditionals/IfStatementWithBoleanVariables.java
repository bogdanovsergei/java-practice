package day10_logicaloperators_conditionals;

public class IfStatementWithBoleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = false;
		if (isBreakTime == true) {
			System.out.println("Break till 8:35 PM");
		} else {
			System.out.println("Not Break time yet.");
		}
		
		//second version
		if (isBreakTime) {
			System.out.println("Break till 8:35 PM");
		} else {
			System.out.println("Not Break time yet.");
		}
		
		boolean classTime = true;
		if (classTime) {
			System.out.println("Come back on time");
		}	
		
		boolean qualified = false;
		if (!(qualified)) {
			System.out.println("You application was not approved.");
		}
		
		
	}

}
