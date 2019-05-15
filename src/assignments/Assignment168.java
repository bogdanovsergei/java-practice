package assignments;

public class Assignment168 {
	public static void main(String[] args) {
		System.out.println(coverString("java methods", "me")); // java [me]thods
	}

	public static String coverString(String main, String coverME) {
		String result = "";
		if(!main.contains(coverME)) {
			main = "[" + main + "]";
			return main;
		}
		
		for (int i=0; i<=main.length()-coverME.length(); i++) {
			if (main.substring(i, i+coverME.length()).equals(coverME)) {
				result += "[" + coverME + "]";
				i+=coverME.length()-1;
			} else if (i==main.length()-coverME.length()) {
				result += main.substring(i);
			} else {
				result += main.charAt(i);
			}
		}
		return result;
	}
}
