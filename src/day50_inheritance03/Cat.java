package day50_inheritance03;

public class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("Cat is saying: Meow");
	}
	
//	public void move(int steps) {
//		System.out.println("Cat is moving " + steps + " steps");
//	}
}
