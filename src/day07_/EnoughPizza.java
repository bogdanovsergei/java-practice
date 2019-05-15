package day07_;

public class EnoughPizza {
	public static void main(String[] args) {
		//slices in pizza ->8
		//slices per studets -> 2
		
		int pizzaCount = 50;
		int studentsCount = 145;
		boolean isEnoughPizza = pizzaCount * 8 /2 >= studentsCount;
		System.out.println("Is enough pizza: " + isEnoughPizza);
		
	}

}
