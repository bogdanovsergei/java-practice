package day38_arraylist03;

import java.util.ArrayList;

public class RawArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		
		System.out.println(list);	//only while printing we can skip .toString(). it automatically call toString()
		//String allValues = list.toString()	- we need toString();
		
	}

}
