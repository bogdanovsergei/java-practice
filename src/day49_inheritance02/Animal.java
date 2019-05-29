package day49_inheritance02;

public class Animal {
	private String type;
	//SUPER()
	public Animal() {
		System.out.println("Animal Constractor");
		type = "indefined";
	}
	
	public Animal(String type) {
		System.out.println("Animal 1 arg constractor");
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
