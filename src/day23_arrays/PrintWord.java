package day23_arrays;

public class PrintWord {
	public static void main(String[] args) {
		String str = "java";
		for (int i=0; i < str.length(); i++) {
			if (str.substring(i, i+1).contentEquals("a")) {
				continue;
			}
			System.out.println(str.substring(i, i+1));
		}
	}

}
