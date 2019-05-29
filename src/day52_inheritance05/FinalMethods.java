package day52_inheritance05;

public class FinalMethods {
	public final void method1() {
		System.out.println("Final method 1");
	}
	
	public final static void staticMethod(String word) {	//static also can be final and we cannot override them
		System.out.println("Static method: "  + word);
	}
	
	class Sub extends FinalMethods {
//cannot override since it is a final method
//		public void method1() {
//			System.out.println("Overrided method 1");
//		}
		
		//overloading is possible
		public final void method1(String str1) {
			System.out.println("Overrided method 1" + str1);
		}
		
		
	}

}
