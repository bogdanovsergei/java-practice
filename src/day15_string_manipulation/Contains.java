package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatos, apples, tomatoes, eggs. milk, bread, cereal, meat";
		// check if the apples the shopping list
		if (list.contains("apples")) {
			System.out.println("Apples are there!");
		} else {
			System.out.println("Lets add apples now!");
		}
		
		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains egss: " + hasEggs);
		
		boolean hasCucumbers = list.contains("cucumbers");
		System.out.println("Contains cucumbers: " + hasCucumbers);
		
	}

}
