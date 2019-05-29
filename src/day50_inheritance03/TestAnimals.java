package day50_inheritance03;

public class TestAnimals {
	public static void main(String[] args) {

		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();

		an.speak();
		cat.speak();
		dog.speak();
		
		an.move(10);
		cat.move(201);
		dog.move(240);
		duck.move(50);
	}

}
