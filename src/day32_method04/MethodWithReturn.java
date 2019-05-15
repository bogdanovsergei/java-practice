package day32_method04;

public class MethodWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i: " + i);
		System.out.println(giveMeYourName());
	}
	
	public static int giveMe10$() {
		return 10;
	}
	
	public static String giveMeYourName() {
		String name = "Serg";
		return name;
	}

}
