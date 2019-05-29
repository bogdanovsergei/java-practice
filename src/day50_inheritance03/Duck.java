package day50_inheritance03;

public class Duck extends Animal {
	
	@Override
	public void speak() {
		System.out.println("Duck is saying: Quwack quwack");
	}
	
	public void move(int steps) {
		System.out.println("Duck is moving " + steps + " steps");
	}
}
