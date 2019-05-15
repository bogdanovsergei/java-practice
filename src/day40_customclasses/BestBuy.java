package day40_customclasses;

public class BestBuy {
	public static void main(String[] args) {
		//System.out.println(brand);
		//it will not work
		//we need to create object to use brand
		//Create CellPhone object
		CellPhone cell1 = new CellPhone();
		
		System.out.println(cell1.brand);
		System.out.println((cell1.screenSize));
		
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.collor = "Silver";
		cell1.price = 76.16;
		
		System.out.println("Brand: " + cell1.brand);
		System.out.println("Screen Size: " + cell1.screenSize);
		System.out.println("Collor: " + cell1.collor);
		System.out.println("Price: " + cell1.price);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.collor = "blue";
		cell2.price = 39.22;
		
		System.out.println("#### CELL 2 VALUES #####");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("Screen Size: " + cell2.screenSize);
		System.out.println("Collor: " + cell2.collor);
		System.out.println("Price: " + cell2.price);
		
		System.out.println("##### Calling Methods ######");
		cell1.call();
		cell1.message();
		cell1.takeAPhoto();
		
		cell2.call();
		cell2.message();
		cell2.takeAPhoto();
		
		
		
	}
}
