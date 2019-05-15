package assignments;
import java.util.*;
public class Ass56_LaptopConfigurator {
	public static void main(String[] args) {
		double price = 0;
		String storageType, screenType, cpu, screenResolution;
		int ram = 0, memorySize = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select screen size:");
		screenType = scan.next();
		switch (screenType) {
		case "13.3":
			price = price + 200;
			break;
		case "15.0":
			price = price + 300;
			break;
		case "17.3":
			price = price + 400;
			break;
		}
		
		System.out.println("Select CPU type:");
		cpu = scan.next();
		switch (cpu) {
		case "i3":
			price = price + 150;
			break;
		case "i5":
			price = price + 250;
			break;
		case "i7":
			price = price + 350;
			break;
		}
		System.out.println("Select RAM size:");
		ram = scan.nextInt();
		while (ram>0) {
			price = price + 50;
			ram = ram - 4;
		}
		
		System.out.println("Select storage type:");
		storageType = scan.next();
		System.out.println("Enter memory size:");
		memorySize = scan.nextInt();
		switch (storageType) {
		case "HDD":
			while (memorySize>0) {
				price = price + 50;
				memorySize = memorySize - 500;
			}
			break;
		case "SSD":
			while (memorySize>0) {
				price = price + 100;
				memorySize = memorySize - 500;
			}
			break;
		}
		
		System.out.println("Enter screen resolution:");
		screenResolution = scan.next();
		switch (screenResolution) {
		case "FULLHD":
			price = price +100;
			break;
		case "4K":
			price = price + 200;
			break;
		}
		
		System.out.println("Laptop price is: $" + price);
		
	}

}
