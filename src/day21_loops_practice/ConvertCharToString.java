package day21_loops_practice;

public class ConvertCharToString {
	public static void main(String[] args) {
		char ch = 'a';
		String str1 = "" + ch;
		
		char ch2 = 'v';
		String str2 = new String("" + ch2);
		
		char ch3 = 'd';
		String str3 = Character.toString(ch3);
		
		System.out.println(str1 + str2 + str3);
		
		
	}

}
