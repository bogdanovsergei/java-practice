package day33_methods05;
import java.util.*;
public class AgeCalculator {
	
	public static void main(String[] args) {
		System.out.println("You are "+ calculateAge(1988) + " years old");
		System.out.println(calculateAge(2022));
	}
	
	public static int calculateAge(int year) {
		/*	Age:
		 * 0-14 => child
		 * 15-24 => youngster
		 * 25-64 => adult
		 * 65 - over => senior
		 * negaitve => Invalid age
		 */
		int age = 2019 - year;
		if (age>=0 && age<=14) {
			System.out.println("Child");
		} else if (age>=15 && age <=24) {
			System.out.println("Youngster");
		} else if (age>=25 && age <=64) {
			System.out.println("Adult");
		} else if (age>=65) {
			System.out.println("Senior");
		} else {
			System.out.println("Invalid age");
			return 0;
		}
		return age;
		
	}

}
