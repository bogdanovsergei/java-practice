package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
		String quality = "good";
		int rating = (quality.contentEquals("good")) ? 100 : 0;
		
		System.out.println("Raiting: " + rating);
		
		int PMhour = 6; // 4-7
		boolean rushHour = (PMhour >= 4 && PMhour <= 7) ? true : false;
		
		System.out.println(PMhour + " is rush hour? " + rushHour);
		
		String result = rushHour ? "Yes" : "No";
		
		System.out.println(PMhour + " is rush hour? " + result);
		
		int AMHour = 8; // 6-9
		
		String amRushHour = (AMHour >=6 && AMHour <=9) ? "Yes" : "No";
		
		System.out.println(AMHour + " is rush hour? - " + amRushHour);
		
	}

}
