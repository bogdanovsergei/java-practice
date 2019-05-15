package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ","");
		System.out.println(withNoSpaces);
		
		//replace coma with !!!
		sentence = sentence.replace(",","!!!");
		System.out.println(sentence);
		
		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@#", "");
		mixed = mixed.replace("@#$", "");
		
		//mixed = mixed.replace("$", "");
		//mixed = mixed.replace("-", "");
		//mixed = mixed.replace("|", "");
		mixed = mixed.replace("$", "").replace("-", "").replace("|", "");;
		System.out.println(mixed);
		
		mixed = mixed.replace("a", "");
		System.out.println(mixed);
		
		String result = "About 150,000,000 results (0.59 seconds)";
		
		//using replace, substring get number of results
		
		result = result.replace("About ","").replace(" results (", "").replace(" seconds)","");
		System.out.println(result);
		result = result.replace(result.substring(11, 15), "");
		System.out.println(result);
		result = result.replace(",", "");
		System.out.println(result);
		
		
		
	}

}
