package day36_wrapperclasses_arraylistintro;
import java.util.ArrayList;
public class ArrayListIntro {
	public static void main(String[] args) {
		//Create an arrayList
		String[] str = new String[5];
		ArrayList<String> names = new ArrayList<>();	//diamond character/diamond operator
		int[] numsArray = new int[5];
		// ArrayList<int> nums = new ArrayList<>();		it not works. Only for OBJECTS
		ArrayList<Integer> nums = new ArrayList<>();
		
		//assign values into arraylist
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");
		
		nums.add(Integer.valueOf("100"));
		nums.add(99);
		nums.add(656);
		nums.add(8566);
		
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(nums.get(0));
		
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+nums.size());
		
		
	}

}
