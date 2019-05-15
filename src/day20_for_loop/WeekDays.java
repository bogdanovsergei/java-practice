package day20_for_loop;

public class WeekDays {
	public static void main(String[] args) {
		//1- Monday
		//2 - Tuesday ...
		
		for (int n =1; n<=7; n++) {
			switch (n) {
			case 1:
				System.out.println(n+ " - Monday");
				break;
			case 2:
				System.out.println(n+ " - Tuesday");
				break;
			case 3:
				System.out.println(n+ " - Wednesday");
				break;
			case 4:
				System.out.println(n+ " - Thursday");
				break;
			case 5:
				System.out.println(n+ " - Friday");
				break;
			case 6:
				System.out.println(n+ " - Saturday");
				break;
			case 7:
				System.out.println(n+ " - Sunday");
				break;
			}
		}
	}

}
