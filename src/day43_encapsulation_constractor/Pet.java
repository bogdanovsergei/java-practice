package day43_encapsulation_constractor;

public class Pet {
	private String type;
	private String name;
	
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public Pet() {
		System.out.println("No-args constractor");
	}
	
	public void speak() {
		switch(type.toLowerCase()) {
		case "cat":
			System.out.println("Myauu");
			break;
		case "dog":
			System.out.println("gav gav|woof woof|waw waw");
			break;
		case "bird":
			System.out.println("chick chirick");
			break;
		case "goat":
			System.out.println("mhaaa mhaaa");
			break;
		case "sheep":
			System.out.println("bhaaa bhaaa");
			break;
		case "rooster":
			System.out.println("u uruuuu uuuuu");
		default:
			System.out.println(".....");
		}
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}
	
	
	
	
	

}
