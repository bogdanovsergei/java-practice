package day12;
import java.util.*;
public class Weather {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather today?");
		String weather = scan.next().toLowerCase();
		
		switch(weather) {
		case "sunny":
			System.out.println("Go to Park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "rainy":
			System.out.println("Go shopping");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Chain your tires");
			System.out.println("Go skiing");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any other weather");
		
		}
	}

}
