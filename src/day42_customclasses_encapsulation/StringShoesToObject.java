package day42_customclasses_encapsulation;
import java.util.*;
import java.lang.*;	//hiden package which is always imported

public class StringShoesToObject {
	public static void main(String[] args) {
		String data = "Bruno Magli,9.5";
		String[] arrData = data.split(",");
		
		Shoes shoes = new Shoes();
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		System.out.println(shoes.getShoesData());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		Shoes shoes1 = new Shoes();
		shoes1.brand = brand;
		shoes1.size = size;
		System.out.println(shoes1.getShoesData());
		
	}

}
