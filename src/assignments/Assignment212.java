package assignments;

public class Assignment212 {

	public static void main(String[] args) {
		String word = "----ee[ree]..,/]';er";
		char[] wordArr = word.toCharArray();
		int k = wordArr.length-1;
		for (int i=0; i<wordArr.length; i++) {
			if (Character.isAlphabetic(wordArr[i])) {
				for (int j=k; j>=0; j--) {
					if(j==i) {
						k=j;
						break;
					}
					if (Character.isAlphabetic(wordArr[j])) {
						char temp = wordArr[i];
						wordArr[i] = wordArr[j];
						wordArr[j] = temp;
						k=j-1;
						break;
					}
					
				}
			}
			if (k==i) {
				break;
			}
		}
		
		word="";
		for(char ch: wordArr) {
			word += ch;
		}
		System.out.println(word);
		
	}
}
