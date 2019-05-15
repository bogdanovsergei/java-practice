package day42_customclasses_encapsulation;

public class Coffee {
	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		String info = name.toUpperCase()+"  "+size.toUpperCase()+" $" +price+" "+calories+" CAL";
		System.out.println(info);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("tall") ||
			newSize.equalsIgnoreCase("grande") ||
			newSize.equalsIgnoreCase("venti")) {
			size = newSize;
		}else {
			System.out.println("ERROR: Invalid Size - " + newSize);
			size = "unknown";
		}
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setCalories(int newCal) {
		calories = newCal;
	}
	
	public void setCoffeeInfo(String newName,String newSize, double newPrice, int newCal) {
		name = newName;
		setSize(newSize);
		price = newPrice;
		calories = newCal;
	}

}