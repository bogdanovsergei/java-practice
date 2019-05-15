package day23_arrays;

public class Arrays2 {
	public static void main(String[] args) {
		String[] names = new String[5];
		String[] names2 = {"Shaun", "Roman", "Vlad", "Burak", "Maria"};
		
		System.out.println(names2[4]);
		
		String[] countries = {};
		//countries[0] = "USA"; //Index 0 out of bounds for length 0.
		String name = null;
		
		String[] fruits = new String[] {"apple", "orange", "banana"};
		
		// for each loop stand for collections of data
		//	we need specify data type, variable name: our collection of data
		// for each loop
		//or enhanced loop
		for(String fruit: names2) {
			System.out.println(fruit);
		}
	}

}
