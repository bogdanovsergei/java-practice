package day15_string_manipulation;

public class IndexOf2 {
	public static void main(String[] args) {
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println("First dash:" + firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("Second dash: " + secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println("Second dash: " + thirdDash);
		
		//find last dash
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: " + lastDash);
		int lastDash2 = list.lastIndexOf("-",lastDash-1);
		System.out.println(lastDash2);
		
	}

}
