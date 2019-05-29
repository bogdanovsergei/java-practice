package day49_inheritance02;

public class Leopard extends Animal{
	
	public Leopard() {
		super();	//call parent class no-args constructor
		System.out.println("Leopard constractor");
		setType("Leopard");
		
	}
	
	public Leopard(String type) {
		super(type);	//call Animal(String type) constructor
		System.out.println("Leopard one-arg constractor");
		
	}

}
