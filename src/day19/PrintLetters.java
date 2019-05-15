package day19;

public class PrintLetters {
	public static void main(String[] args) {
		String word = "Amazon";
		int indx = 0;
		//print each character one by one in separate lines
		while (indx < word.length()) {
			System.out.println(word.charAt(indx++));
			//indx++;
		}
		
		//print each character in reverse order
		indx = word.length()-1;
		while (indx >= 0) {
			System.out.println(word.charAt(indx--));
		}
		
	}

}
