package day50_inheritance03;

public class Dog extends Animal{
	@Override	//just checking is method overriden or not
	public void speak() {
		System.out.println("Dog is saying: Woof woof");
	}
	
	public void move(int steps) {
		System.out.println("Dog is moving " + steps + " steps");
	}
}
